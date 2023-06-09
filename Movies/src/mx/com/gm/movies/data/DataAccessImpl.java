package mx.com.gm.movies.data;

import java.io.*;
import java.util.*;
import mx.com.gm.movies.domain.Movie;
import mx.com.gm.movies.exceptions.*;

public class DataAccessImpl implements IDataAccess {

    @Override
    public boolean exist(String resourceName) {
        File file = new File(resourceName);
        return file.exists();
    }

    @Override
    public List<Movie> list(String resourceName) throws ReadDataEx {
        var file = new File(resourceName);
        List<Movie> movies = new ArrayList<>();
        try {
            var inputData = new BufferedReader(new FileReader(file));
            String item = null;
            item = inputData.readLine();
            while (item != null) {
                var movie = new Movie(item);
                movies.add(movie);
                item = inputData.readLine();
            }
            inputData.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new ReadDataEx("List all data exception: " + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new ReadDataEx("List all data exception: " + ex.getMessage());
        }
        return movies;
    }

    @Override
    public void write(Movie movie, String resourceName, boolean attach) throws WriteDataEx {
        var file = new File(resourceName);
        try {
            var output = new PrintWriter(new FileWriter(file, attach));
            output.println(movie.toString());
            output.close();
            System.out.println("Saved movie: " + movie);
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new WriteDataEx("Create exception: " + ex.getMessage());
        }
    }

    @Override
    public String find(String resourceName, String find) throws ReadDataEx {
        var file = new File(resourceName);
        String result = null;
        try {
            var input = new BufferedReader(new FileReader(file));
            String item = null;
            item = input.readLine();
            var index = 1;
            while (item != null) {
                if (find != null && find.equalsIgnoreCase(item)) {
                    result = "Movie " + item + " found with index " + index;
                    break;
                }
                item = input.readLine();
                index++;
            }
            input.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new ReadDataEx("find movie exception: " + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new ReadDataEx("find movie exception: " + ex.getMessage());
        }
        return result;
    }

    @Override
    public void create(String resourceName) throws AccessDataEx {
        var file = new File(resourceName);
        try {
            var output = new PrintWriter(new FileWriter(file));
            output.close();
            System.out.println("File created");
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new ReadDataEx("Creating file exception: " + ex.getMessage());
        }
    }

    @Override
    public void delete(String resourceName) {
        var file = new File(resourceName);
        if (file.exists()) {
            file.delete();
        }
        System.out.println("File deleted");
    }

}

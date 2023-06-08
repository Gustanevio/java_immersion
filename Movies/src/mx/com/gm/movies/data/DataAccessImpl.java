package mx.com.gm.movies.data;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.com.gm.movies.domain.Movie;
import mx.com.gm.movies.exceptions.*;

public class DataAccessImpl implements IDataAccess {

    @Override
    public boolean exist(String resourceName) throws AccessDataEx {
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
    public void white(Movie movie, String resourceName, boolean attach) throws WriteDataEx {
    }

    @Override
    public String read(String resourceName, String read) throws ReadDataEx {
    }

    @Override
    public void save(String resourceName) throws AccessDataEx {
    }

    @Override
    public void delete(String resourceName) throws AccessDataEx {
    }

}

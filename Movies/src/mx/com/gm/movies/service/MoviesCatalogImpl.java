package mx.com.gm.movies.service;

import mx.com.gm.movies.data.*;
import mx.com.gm.movies.domain.Movie;
import mx.com.gm.movies.exceptions.AccessDataEx;
import mx.com.gm.movies.exceptions.ReadDataEx;

public class MoviesCatalogImpl implements IMoviesCatalog {

    private final IDataAccess data;

    public MoviesCatalogImpl() {
        this.data = new DataAccessImpl();
    }

    @Override
    public void addMovie(String movieName) {
        Movie movie = new Movie(movieName);
        boolean attach = false;
        try {
            attach = data.exist(RESOURCE_NAME);
            data.write(movie, RESOURCE_NAME, attach);
        } catch (AccessDataEx ex) {
            System.out.println("Access data essor");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void listMovies() {
        try {
            var movies = this.data.list(RESOURCE_NAME);
            for (var movie : movies) {
                System.out.println("Movie = " + movie);
            }
        } catch (AccessDataEx ex) {
            System.out.println("Error accessing data");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void findMovie(String movie) {
        String result = null;
        try {
            result = this.data.find(RESOURCE_NAME, movie);
        } catch (ReadDataEx ex) {
            System.out.println("Error finding movie");
            ex.printStackTrace(System.out);
        }
        System.out.println("Result = " + result);
    }

    @Override
    public void startMoviesCatalog() {
        try {
            if (this.data.exist(RESOURCE_NAME)) {
                data.delete(RESOURCE_NAME);
                data.create(RESOURCE_NAME);
            } else {
                data.create(RESOURCE_NAME);
            }
        } catch (AccessDataEx ex) {
            System.out.println("error trying to initialize movies catalog");
            ex.printStackTrace(System.out);
        }
    }

}

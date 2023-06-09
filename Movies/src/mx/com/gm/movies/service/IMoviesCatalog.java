package mx.com.gm.movies.service;

public interface IMoviesCatalog {

    String RESOURCE_NAME = "movies.txt";

    void addMovie(String movieName);

    void listMovies();

    void findMovie(String movie);

    void startMoviesCatalog();
}

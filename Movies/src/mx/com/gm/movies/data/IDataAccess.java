package mx.com.gm.movies.data;

import java.util.*;
import mx.com.gm.movies.domain.Movie;
import mx.com.gm.movies.exceptions.*;

public interface IDataAccess {

    boolean exist(String resourceName) throws AccessDataEx;

    List<Movie> list(String resourceName) throws ReadDataEx;

    void write(Movie movie, String resourceName, boolean attach) throws WriteDataEx;

    String find(String resourceName, String read) throws ReadDataEx;

    void create(String resourceName) throws AccessDataEx;

    void delete(String resourceName) throws AccessDataEx;
}

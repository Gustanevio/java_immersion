package mx.com.gm.movies.data;

import java.util.*;
import mx.com.gm.movies.domain.Movie;
import mx.com.gm.movies.exceptions.*;

public interface IDataAccess {

    boolean exist(String resourceName) throws AccessDataEx;

    List<Movie> list(String resourceName) throws ReadDataEx;

    void white(Movie movie, String resourceName, boolean attach) throws WriteDataEx;

    String read(String resourceName, String read) throws ReadDataEx;

    void save(String resourceName) throws AccessDataEx;

    void delete(String resourceName) throws AccessDataEx;
}

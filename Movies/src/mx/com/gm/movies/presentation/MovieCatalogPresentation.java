package mx.com.gm.movies.presentation;

import java.util.Scanner;
import mx.com.gm.movies.service.IMoviesCatalog;
import mx.com.gm.movies.service.MoviesCatalogImpl;

public class MovieCatalogPresentation {

    public static void main(String[] args) {
        var option = -1;
        var scanner = new Scanner(System.in);
        IMoviesCatalog catalog = new MoviesCatalogImpl();

        while (option != 0) {
            System.out.println("Select an option: \n"
                    + "1. Start movies catalog \n"
                    + "2. Add movie \n"
                    + "3. List movies \n"
                    + "4. Find movie \n"
                    + "0. Exit \n");
            option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1:
                    catalog.startMoviesCatalog();
                    break;
                case 2:
                    System.out.println("Type movie's name");
                    var movieName = scanner.nextLine();
                    catalog.addMovie(movieName);
                    break;
                case 3:
                    catalog.listMovies();
                    break;
                case 4:
                    System.out.println("Inser movies to find");
                    var findMovie = scanner.nextLine();
                    catalog.findMovie(findMovie);
                    break;
                case 0:
                    System.out.println("See you when you see me!");
                    break;
                default:
                    System.out.println("Option does not exist");
                    break;
            }
        }
    }
}

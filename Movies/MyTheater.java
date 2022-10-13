import java.util.Map;
import java.util.HashMap;
import java.io.*; 
import java.util.*;


public class MyTheater {
    public static void main(String[] args) {
        Console console = System.console();
        // ourMovies will store all the current movies by category
        Map<String, Movie[]> ourMovies = new HashMap<>();

        Movie[] actionMovies = MovieSorter.retrieveMovies(Movie.CAT_ACTION);
        Movie[] horrorMovies = MovieSorter.retrieveMovies(Movie.CAT_HORROR);
        Movie[] allMovies = MovieSorter.retrieveMovies(Movie.CAT_ALL);

        ourMovies.put(Movie.CAT_ACTION, actionMovies);
        ourMovies.put(Movie.CAT_HORROR, horrorMovies);
        ourMovies.put(Movie.CAT_ALL, allMovies);

        for(Movie movie : allMovies) {
            String format = "%s is an %s Movie\n";
            System.out.printf(format, movie.getName(), movie.getCategory());
        }
        
        // Movie[] actionMoviesFromStorage = ourMovies.get(Movie.CAT_ACTION);
        // // print our action movies
        // for(Movie movie : actionMoviesFromStorage) {
        //     movie.printName();
        // }

        // Movie[] horrorMoviesFromStorage = ourMovies.get(Movie.CAT_HORROR);
        // // print our action movies
        // for(Movie movie : horrorMoviesFromStorage) {
        //     movie.printName();
        // }

        String input = console.readLine("Enter 1 to print movie categories: ");

        // if input is 1 then print the categories out
        int inputNumber = Integer.parseInt(input);
        if(inputNumber == 1) {
            System.out.println("categories will be printed here after construction");
        }

    }
}

class MovieSorter {

    // retrieveMovies will get all our current movies by a certain category
    public static Movie[] retrieveMovies(String category) {

        Movie jurassicPark = new Movie("Jurassic Park", Movie.CAT_ACTION);
        Movie theMatrix = new Movie("The Matrix", Movie.CAT_ACTION);
        Movie scream = new Movie("Scream", Movie.CAT_HORROR);
        Movie theConjuring = new Movie("The Conjuring", Movie.CAT_HORROR);

        Movie[] horrorMovies = {scream, theConjuring};
        Movie[] actionMovies = {jurassicPark, theMatrix};

        Movie[] allMovies = {scream, theConjuring, jurassicPark, theMatrix};

        // List<Movie> allMoviesList = Arrays.asList(horrorMovies);
        // allMoviesList.addAll(Arrays.asList(actionMovies));

        // Movie[] allMovies;

        if(category == Movie.CAT_ACTION) {

            return actionMovies;
        }

        if(category == Movie.CAT_HORROR) {
            return horrorMovies;
        }

        if(category == Movie.CAT_ALL) {

            return allMovies;
        }

        return null;
    }
}

class Movie {
    private String name;
    private String category;
    public static final String CAT_ALL = "ALL";
    public static final String CAT_ACTION = "ACTION";
    public static final String CAT_HORROR = "HORROR";
    public static final String CAT_COMEDY = "COMEDY";
    public static final String CAT_ROMANCE = "ROMANCE";

    public static final String[] categories = {CAT_ACTION, CAT_HORROR, CAT_COMEDY, CAT_ROMANCE};

    Movie(String name) {
        this.name = name;
    }

    Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    // getter
    public String getCategory() {
        return category;
    }

    // setter
    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void printName() {
        System.out.println(this.name);
    }
}
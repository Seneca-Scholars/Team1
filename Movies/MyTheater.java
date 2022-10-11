import java.util.Map;
import java.util.HashMap;
import java.io.*; 


public class MyTheater {
    public static void main(String[] args) {
        Console console = System.console();
        // ourMovies will store all the current movies by category
        Map<String, Movie[]> ourMovies = new HashMap<>();

        Movie[] actionMovies = MovieSorter.retrieveMovies(Movie.CAT_ACTION);
        Movie[] horrorMovies = MovieSorter.retrieveMovies(Movie.CAT_HORROR);

        ourMovies.put(Movie.CAT_ACTION, actionMovies);
        ourMovies.put(Movie.CAT_HORROR, horrorMovies);

        Movie[] actionMoviesFromStorage = ourMovies.get(Movie.CAT_ACTION);
        // print our action movies
        for(Movie movie : actionMoviesFromStorage) {
            movie.printName();
        }

        Movie[] horrorMoviesFromStorage = ourMovies.get(Movie.CAT_HORROR);
        // print our action movies
        for(Movie movie : horrorMoviesFromStorage) {
            movie.printName();
        }

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

        if(category == Movie.CAT_ACTION) {
            Movie jurassicPark = new Movie("Jurassic Park");
            Movie theMatrix = new Movie("The Matrix");

            Movie[] actionMovies = {jurassicPark, theMatrix};

            return actionMovies;
        }

        if(category == Movie.CAT_HORROR) {
            Movie[] horrorMovies = {new Movie("Scream"), new Movie("The Conjuring")};
            return horrorMovies;
        }

        return null;
    }
}

class Movie {
    private String name;
    public static final String CAT_ACTION = "ACTION";
    public static final String CAT_HORROR = "HORROR";
    public static final String CAT_COMEDY = "COMEDY";
    public static final String CAT_ROMANCE = "ROMANCE";

    public static final String[] categories = {CAT_ACTION, CAT_HORROR, CAT_COMEDY, CAT_ROMANCE};

    Movie(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println(this.name);
    }
}
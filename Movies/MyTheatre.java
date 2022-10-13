package Movies;

import java.io.Console;
import java.util.HashMap;
import java.util.Map;

public class MyTheatre {
    public static void main(String[]args){
        Console console = System.console();
        Map<String,Movie[]> ourMovies = new HashMap<>();
        Movie[] actionMovies = MovieSorter.retrieveMovies(Movie.CAT_ACTION);
        ourMovies.put(Movie.CAT_ACTION, actionMovies);
        
        for(Movie movie : ourMovies.get(Movie.CAT_ACTION)){
            movie.printName();
        }
        
        String input = console.readLine("Enter 1 to print movie categories:\n");

        int inputNumber = Integer.parseInt(input);
        if(inputNumber == 1) {
            System.out.println("categories will be printed here after construction");
        }

    }
}
class MovieSorter {
    public static Movie[] retrieveMovies(String category){
      if(category == Movie.CAT_ACTION){
        Movie halloween = new Movie("Halloween");
        Movie insidious = new Movie("Insidious");

        Movie[] actionMovies ={halloween, insidious};
        return actionMovies;
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
    
    Movie(String name){
        this.name = name;
    }
    public void printName(){
        System.out.println(this.name);
    }
}
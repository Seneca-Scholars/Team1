import java.io.Console;

public class AchievingArrays {
  public static void main(String[] args) {
  Console console = System.console();

  /*
    *  ARRAYS PRACTICE!
    * 
    * Uncomment each of the if statements and fix the code so it 
    * outputs for each statement based on the print
    * 
    */

    String[] teachers = new String[3];
    teachers[0] = "Jay";
    teachers[1] = "Dave";
    teachers[2] = "James";

    // TODO: Replace null with an array literal that matches the long form above
    String[] teachersLongForm = null;

    String[] programmers = {
            "Yukihiro Matsumoto",
            "David Nolen",
            "Grace Hopper",
            "Linus Torvalds",
            "You"
    };

  System.out.println("Choose a programmer:");

  for (int i = 0; i < programmers.length; i ++){
    System.out.println(programmers[i]);

  }
  // TODO: Print out a menu by looping through the programmers array.
  /*
    The menu should be in the form of (each on a line of its own, starting with 1):
    1. Yukihiro Matsumoto
    2. David Nolen
    ...
  */
  


  }

    
}

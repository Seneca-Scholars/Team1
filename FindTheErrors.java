import java.io.Console;

public class FindTheErrors {
    public static void main(String[] args) {
        Console console = System.console();

        String firstName = console.readLine("Enter your first name:  ");
        String lastName = console.readLine("Enter your last name:  ");
        String ageString = console.readLine("Enter your age:  ");

        int age = Integer.parseInt(ageString);

         if(age < 14) {
             console.printf("Sorry, but %s is too young to use this app. \n", age);
             System.exit(0);
         }

         console.printf("Welcome to our app %s %s!", firstName, lastName);
    }
    
}

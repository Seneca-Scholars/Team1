import java.io.Console;

public class SenecaMadLibs {
    public static void main(String[] args) {
        Console console = System.console();
        // printf to be able to use format sp
        String age = console.readLine("Enter your age:  ");
        int newAge = Integer.parseInt(age);

<<<<<<< HEAD
        // printf to be able to use format specifiers
        // format specifier for string %s

        console.printf("this class is awesome\n" );

        String name = console.readLine("Enter Your Name: ");
        String food = console.readLine("Enter Type Of Food: ");
        String drink = console.readLine("Enter Type Of Drink: ");
        console.printf("%s wants to eat a %s and wants to drink a %s\n\n", name ,food,drink);
        if (food.equals("mango")) {
            console.printf("mangos are ehh");
        }

        console.printf("this class is awesome\n\n");
        // printf to be able to use format specifiers 
        // format specifier for string %s
        String Name = console.readLine("Enter your name:  ");

        String Food = console.readLine("Enter a type of food:  ");

        String Drink = console.readLine("Enter a type of drink:  ");
=======
        if(newAge < 14) {
            console.printf("You're too young to use this program. Goodbye!\n");
            System.exit(0);
        }

        String teammates = ("Liz", "Norris", "Damaria", "Ben");

>>>>>>> main


<<<<<<< HEAD
        console.printf("%s wants to eat a %s and drink %s", Name, Food, Drink);

=======
        String name = console.readLine("Enter your name:  ");
        String adjective = console.readLine("Enter a adjective: ");
        String adverb = console.readLine("Enter a adverb:  ");
        String verb = console.readLine("Enter a verb: ");
        String noun = console.readLine("Enter a noun: ");

        console.printf("Your story:\n-------------\n");
        console.printf("%s is a %s %s\n", name, adjective, noun);
        console.printf("They are always %s %s\n", verb, adverb); 
>>>>>>> main

    }
}

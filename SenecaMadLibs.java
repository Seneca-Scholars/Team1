import java.io.Console;

public class SenecaMadLibs {


    public static void main(String[] args) {
        Console console = System.console();
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

    }
}

import java.io.Console;

public class SenecaMadLibs {
    public static void main(String[] args) {
        Console console = System.console();

        // printf to be able to use format specifiers
        // format specifier for string %s
        console.printf("this class is awesome\n\n");
        // printf to be able to use format specifiers 
        // format specifier for string %s
        String name = console.readLine("Enter your name:  ");

        String food = console.readLine("Enter a type of food:  ");

        String drink = console.readLine("Enter a type of drink:  ");

        //System.out.println(food);
        if (food.equals("mango")){
            console.printf("\nMangos are eh\n");
            //System.out.println("Jalan doesn't like mangos???");
        }

        console.printf("%s is ok\n", name);

        console.printf("%s wants to eat a %s and drink %s", name, food, drink);

    }
}

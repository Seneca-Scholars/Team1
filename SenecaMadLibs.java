import java.io.Console;

public class SenecaMadLibs {
    public static void main(String[] args) {
        Console console = System.console();
        // printf to be able to use format specifiers
        // format specifier for string %s
        console.printf("this class is cool\n\n");
        // printf to be able to use format specifiers
        // format specifier for string %s
        String name = console.readLine("Enter your name:  ");
    

        console.printf("is amazing\n", name);
        
    }
}

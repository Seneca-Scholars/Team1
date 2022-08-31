import java.io.Console;

public class SenecaMadLibs {
    public static void main(String[] args) {
        Console console = System.console();
        // printf to be able to use format specifiers
        // format specifier for string %s
        String name = console.readLine("Enter Your Name: ");
        console.printf("%s is an awesome student\n\n", name);

    }
}

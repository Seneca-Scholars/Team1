import java.io.Console;

public class SenecaMadLibs {
    public static void main(String[] args) {
        Console console = System.console();
        // printf to be able to use format sp
        String age = console.readLine("Enter your age:  ");
        int newAge = Integer.parseInt(age);

        if(newAge < 14) {
            console.printf("You're too young to use this program. Goodbye!\n");
            System.exit(0);
        }

        String teammates = ("Liz", "Norris", "Damaria", "Ben");



        String name = console.readLine("Enter your name:  ");
        String adjective = console.readLine("Enter a adjective: ");
        String adverb = console.readLine("Enter a adverb:  ");
        String verb = console.readLine("Enter a verb: ");
        String noun = console.readLine("Enter a noun: ");

        console.printf("Your story:\n-------------\n");
        console.printf("%s is a %s %s\n", name, adjective, noun);
        console.printf("They are always %s %s\n", verb, adverb); 

    }
}

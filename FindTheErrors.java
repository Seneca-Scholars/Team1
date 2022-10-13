import java.io.Console;

public class FindTheErrors {
    public static void main(String[] args) {
        Console console = System.console();

        String name = "Liz";

        // int a = 4; 
        // boolean b = (a == 4 || 8 + 3 == 12) && a == 3;
        
        // if(b) {
        //     console.printf("we got here\n");
        // }


        String[] teammates = { "Damaria", "Ben", "Liz", "Norris" };

        for (String mate : teammates) {
            // console.printf("Hey %s! Please join class asap! %n", mate);
        }

        // 1. initialize exp
        // 2. termination condition/expression
        // 3. increment/step condition
        
        for (int i=0;i<teammates.length;i++) {
            console.printf("Hey %s! Please join class asap! %n", teammates[i]);
        }

        console.printf("Hey %s! Please join class asap! %n", teammates[teammates.length - 1]);

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

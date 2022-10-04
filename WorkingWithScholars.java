import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class WorkingWithScholars {

    private static void outputIntroduction() {
        System.out.println("Welcome to our Scholars Application!");
        // System.out.printf("The max amount of students is: %s %n", SenecaScholars.MAX_CLASS_SIZE);
    } 

    public static void main(String[] args) {
        Console console = System.console();
        // introduce ourselves 
        outputIntroduction();

        String classSizeString = console.readLine("Enter the class size:  ");
        int classSize = Integer.parseInt(classSizeString);
        // create an object to model our scholars
        SenecaScholars team1 = new SenecaScholars(classSize);
        SenecaScholars team2 = new SenecaScholars(4);
        SenecaScholars team3 = new SenecaScholars(5);

        List<SenecaScholars> ourTeams = new ArrayList<>();
        ourTeams.add(team1);
        ourTeams.add(team2);
        ourTeams.add(team3);

        for(int i = 0; i < ourTeams.size(); i++) {
            console.printf(
                "Team %d has %d members %n", 
                i+1, 
                ourTeams.get(i).getClassSize()
            );
        }


        // scholars.printClassSize();
    }
}  
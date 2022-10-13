import java.io.Console;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

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

        // for(int i = 0; i < ourTeams.size(); i++) {
        //     console.printf(
        //         "Team %d has %d members %n", 
        //         i+1, 
        //         ourTeams.get(i).getClassSize()
        //     );
        // }

        // for(SenecaScholars team : ourTeams){
        //     console.printf(
        //         "Team has %d members %n", 
        //         team.getClassSize()
        //     );
        // }

        Map<Integer, String> teamNames = new HashMap<>();
        teamNames.put(0, "Hashira");
        teamNames.put(1, "ctrl");
        teamNames.put(2, "coders");

        List<SenecaScholars> dynamicTeams = new ArrayList<>();

        for(int j = 0; j < teamNames.size(); j++) {
            SenecaScholars tempSS = new SenecaScholars(classSize);
            tempSS.setTeamName(teamNames.get(j));
            dynamicTeams.add(tempSS);
        }

        for(SenecaScholars dTeam : dynamicTeams) {
            System.out.println(dTeam.getTeamName() + " has a class size of: " + dTeam.getClassSize());
        }
        

        Map<String, SenecaScholars> mapOfTeams = new HashMap<>();
        mapOfTeams.put("team1", team1);
        mapOfTeams.put("team2", team2);
        mapOfTeams.put("team3", team3);

        // mapOfTeams.forEach((String key,SenecaScholars team) -> System.out.println("Key = "
        // + key + ", Class Size = " + team.getClassSize()));

    }
}  
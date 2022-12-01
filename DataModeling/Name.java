package DataModeling;


public class Name {
    public static void main(String[] args){
        Scholar scholarOne = new Scholar("Angelo");
        Scholar scholarTwo = new Scholar("Bob");
        Scholar scholarThree = new Scholar("Estrella");
        Scholar scholarfour = new Scholar("Jalan");
        
        SenecaTeams teamOne = new SenecaTeams();
        teamOne.addScholar(scholarfour);
        teamOne.addScholar(scholarOne);
        teamOne.addScholar(scholarTwo);
        teamOne.addScholar(scholarThree);
        teamOne.getScholars();

    }
}

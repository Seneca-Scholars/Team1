import java.io.Console;

public class WorkingWithScholars {

    private static void outputIntroduction() {
        System.out.println("Welcome to our Scholars Application!");
    } 

    public static void main(String[] args) {
        Console console = System.console();
        // introduce ourselves 
        outputIntroduction();

        String classSizeString = console.readLine("Enter the class size:  ");
        int classSize = Integer.parseInt(classSizeString);
        // create an object to model our scholars
        SenecaScholars scholars = new SenecaScholars(classSize);

        scholars.printClassSize();
    }
}  
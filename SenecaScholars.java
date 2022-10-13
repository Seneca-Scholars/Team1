public class SenecaScholars {
    private int classSize;
    private String teamName;
    public int MAX_CLASS_SIZE = 12;

    public SenecaScholars(int classSize) {
        this.classSize = classSize;
    }

    public void printClassSize() {
        // output the details of our scholars to the user
        System.out.printf("Our class size is %d %n", classSize);
    }

    public int getClassSize() {
        return this.classSize;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return this.teamName;
    }

    // Method that sets a new class size and returns the old
    public int setClassSize(int newSize) {
        int oldSize = this.classSize;
        
        this.classSize = newSize;

        return oldSize;
    }
}
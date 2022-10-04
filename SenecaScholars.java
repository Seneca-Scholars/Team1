public class SenecaScholars {
    private int classSize;
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

    // Method that sets a new class size and returns the old
    public int setClassSize(int newSize) {
        int oldSize = this.classSize;
        
        this.classSize = newSize;

        return oldSize;
    }
}
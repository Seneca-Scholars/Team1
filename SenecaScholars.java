public class SenecaScholars {
    private int classSize;

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
}
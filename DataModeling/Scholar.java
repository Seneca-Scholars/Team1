package DataModeling;

public class Scholar {
    private String name;
    Interest[] interests;
    public Scholar(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}

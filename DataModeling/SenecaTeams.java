package DataModeling;
import java.util.List;

import DataModeling.Scholar;
public class SenecaTeams {
    private String name;
    private Scholar[] scholars;
    public SenecaTeams(){
        this.name = name;
        this.scholars = new Scholar[5];
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void addScholar(Scholar Scholar){
        for (int i = 0; i < 5; i++){
            if(this.scholars[i] == null){
                this.scholars[i] = Scholar;
                return;
            }

        }
        
    }
    public void getScholars(){
        for (int i = 0; i < 5; i++){
            if(this.scholars[i] != null){
                System.out.println(this.scholars[i].getName());
            }
          

        }
        
    }
}

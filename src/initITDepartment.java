import java.util.ArrayList;

public class initITDepartment {
    public ArrayList<Courses> initDepartment(){
        ArrayList<Courses> ITList = new ArrayList<Courses>(); 
        ITList.addAll(new Year2_IT_Core().getList()); 
        ITList.addAll(new Year2_IT_Elec().getList()); 
        ITList.addAll(new Year3_IT().getList());  
        ITList.addAll(new Year2_CS_Elec().getList()); 
        ITList.addAll(new Year3_CS().getList()); 

        return ITList; 
    }//end
}//end

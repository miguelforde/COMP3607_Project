import java.util.ArrayList;

public class initCSDepartment {
    public ArrayList<Courses> initDepartment(){ 
        ArrayList<Courses> courseList = new ArrayList<Courses>(); 
        courseList.addAll(new Year2_CS_Core().getList()); 
        courseList.addAll(new Year2_CS_Elec().getList()); 
        courseList.addAll(new Year3_CS().getList());  
        courseList.addAll(new Year2_IT_Elec().getList());  
        courseList.addAll(new Year3_IT().getList()); 

        return courseList;
    }//end
}//end

import java.util.ArrayList;

public class initCSDepartment {
    public ArrayList<Courses> initDepartment(){ 
        ArrayList<Courses> courseList = new ArrayList<Courses>(); 
        courseList.addAll(new Year_2_CS_Core_Sem1().getList()); 
        courseList.addAll(new Year_2_CS_Core_Sem2().getList()); 
        courseList.addAll(new Year_3_CS_Elec_Sem1().getList());  
        courseList.addAll(new Year_3_CS_Elec_Sem2().getList());  

        return courseList;
    }//end 

    public ArrayList<Courses> getSem1(){ 
        ArrayList<Courses> courseList = new ArrayList<Courses>(); 
        courseList.addAll(new Year_2_CS_Core_Sem1().getList()); 
        courseList.addAll(new Year_3_CS_Elec_Sem1().getList());   

        return courseList;
    }//end  

    public ArrayList<Courses> getSem2(){ 
        ArrayList<Courses> courseList = new ArrayList<Courses>(); 
        courseList.addAll(new Year_2_CS_Core_Sem2().getList());  
        courseList.addAll(new Year_3_CS_Elec_Sem2().getList());  

        return courseList; 
    }//end

}//end

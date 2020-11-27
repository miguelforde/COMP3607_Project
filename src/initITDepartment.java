import java.util.ArrayList;

public class initITDepartment {
    public ArrayList<Courses> initDepartment(){
        ArrayList<Courses> ITList = new ArrayList<Courses>(); 
        ITList.addAll(new Year_2_IT_Core_Sem1().getList());  
        ITList.addAll(new Year_2_IT_Core_Sem2().getList()); 
        ITList.addAll(new Year3_IT_Elec_Sem1().getList());   
        ITList.addAll(new Year_3_IT_Elec_Sem2().getList()); 


        return ITList; 
    }//end 

    public ArrayList<Courses> getSem1(){
        ArrayList<Courses> ITList = new ArrayList<Courses>(); 
        ITList.addAll(new Year_2_IT_Core_Sem1().getList());  
        ITList.addAll(new Year3_IT_Elec_Sem1().getList());   


        return ITList; 
    }//end 

    public ArrayList<Courses> getSem2(){
        ArrayList<Courses> ITList = new ArrayList<Courses>();  
        ITList.addAll(new Year_2_IT_Core_Sem2().getList()); 
        ITList.addAll(new Year_3_IT_Elec_Sem2().getList()); 


        return ITList; 
    }//end
}//end

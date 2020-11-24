import java.util.ArrayList;

public class StudentCS implements Student,Visitable{
    private String name;  
    private String major;
    private String minor = "Computer Science"; 
    private ArrayList<Courses> registeredCourses; 
    private double gpa; 

    public void register(Courses course){ 

    }//end register()


    public void accept(Visitor visitor){ 
        
    }//end accept()



}//end StudentCS

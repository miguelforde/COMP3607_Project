import java.util.ArrayList;

public class StudentIT implements Student,Visitable{
    private String name;  
    private String major;
    private String minor = "Information Technology"; 
    private ArrayList<Courses> registeredCourses; 
    private double gpa; 

    public void register(Courses course){ 

    }//end register() 

    public void accept(Visitor visitor){ 

    }//end

}//end StudentIT()

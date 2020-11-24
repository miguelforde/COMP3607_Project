import java.util.ArrayList;

public class StudentIT implements Student,Visitable{
    private String name;  
    private String major;
    private String minor = "Information Technology"; 
    private ArrayList<Courses> registeredCourses;  
    private ArrayList<Courses> completedCourses; 
    private double gpa; 

    public void register(Courses course){ 

    }//end register() 

    public void accept(Visitor visitor){  
        visitor.visit(this);
    }//end

    public ArrayList<Courses> getRegisteredCourses() {
        return this.registeredCourses;
    }//end 

    public ArrayList<Courses> getCompletedCourses(){ 
        return this.completedCourses;
    }//end get()

}//end StudentIT()

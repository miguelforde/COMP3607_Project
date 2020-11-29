import java.util.ArrayList;

public interface Student {
    public void register(Courses course); 
    public ArrayList<Courses> getRegisteredCourses(); 
    public ArrayList<Courses> getCompletedCourses(); 
    public String getName(); 
    public String getMajor(); 
    public String getMinor();   
    public void accept(Visitor visitor);
    public void setAvailableCourses(Courses course); 
    public ArrayList<Courses> getAvailableCourses(); 
}//end Student()

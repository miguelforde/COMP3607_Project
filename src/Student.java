import java.util.ArrayList;

public interface Student {
    public void register(Courses course); 
    public ArrayList<Courses> getRegisteredCourses(); 
    public ArrayList<Courses> getCompletedCourses();
}//end Student()

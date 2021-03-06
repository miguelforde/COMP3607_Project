import java.util.ArrayList;

public class Department implements CourseListing {
    private ArrayList<Courses> departmentCourses;  

    public Department(){ 
        this.departmentCourses = new ArrayList<Courses>(); 

    }//end department()
    
    public boolean getAvailable(Student student){ 
        for(Courses obj : departmentCourses) {
            if(obj.getAvailable(student) == true){  
                student.setAvailableCourses(obj);
                //System.out.println(obj.getCourseCode());
            }//end
        }//end
        return true;
    }//end register()  

    public void addCourse(Courses course){ 
        this.departmentCourses.add(course);
    }//end addCourse() 

    public void removeCourse(Courses course){ 
        this.departmentCourses.remove(course);
    }//end removeCourse() 

    public ArrayList<Courses> getCourses(){ 
        return this.departmentCourses;
    }//end 


}//end Department()
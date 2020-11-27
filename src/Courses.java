import java.util.ArrayList;

public class Courses implements CourseListing {
    private String courseCode;  
    private String title;
    private int credits; 
    private Courses prerequisite;  
    private double qualityGrade;

    public Courses(String courseCode,int credits,Courses prerequisite,String title){ 
        this.courseCode = courseCode; 
        this.credits = credits; 
        this.prerequisite = prerequisite; 
        this.title = title;
    }//end Courses()  

    public Courses(String courseCode,int credits,Courses prerequisite,double qualityGrade,String title){ 
        this.courseCode = courseCode; 
        this.credits = credits; 
        this.prerequisite = prerequisite;  
        this.title = title;
        this.qualityGrade = qualityGrade;
    }//end Courses()

    public boolean getAvailable(Student student){   
        ArrayList<Courses> studentCourses = student.getCompletedCourses(); 

 
        for(Courses obj: studentCourses){ 
            //System.out.println(obj.getCourseCode());   
            if ((this.prerequisite == null)  || (obj.getCourseCode().equals(this.getCourseCode()))) return false;
        }//end  

        for(Courses obj: studentCourses){ 
            //System.out.println(obj.getCourseCode());   
            if (obj.getCourseCode().equals(this.prerequisite.getCourseCode() )){ 
                
                return true;
            }  
        }//end  
        
        return false;
    }//end getAvailable() 

    public String getCourseCode(){ 
        return this.courseCode+" "+this.title;
    }//end getCourseCode()


}//end Courses()

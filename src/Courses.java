import java.util.ArrayList;

public class Courses implements CourseListing {
    private String courseCode;  
    private String title;
    private int credits; 
    private Courses prerequisite1, prerequisite2;  
    private double qualityGrade;

    public Courses(String courseCode,int credits,Courses prerequisite1,String title){ 
        this.courseCode = courseCode; 
        this.credits = credits; 
        this.prerequisite1 = prerequisite1; 
        this.title = title;
    }//end Courses()
    
    public Courses(String courseCode, int credits, Courses prerequisite1, Courses prerquisite2, double qualityGrade,String title){ 
        this.courseCode = courseCode; 
        this.credits = credits; 
        this.prerequisite1 = prerequisite1;
        this.prerequisite2 = prerequisite2;
        this.title = title;
        this.qualityGrade = qualityGrade;
    }//end Courses()
    
    public Courses(String courseCode,int credits,Courses prerequisite1,double qualityGrade,String title){ 
        this.courseCode = courseCode; 
        this.credits = credits; 
        this.prerequisite1 = prerequisite1;  
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

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

    public void getAvailable(){ 

    }//end getAvailable()


}//end Courses()

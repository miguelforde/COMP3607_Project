import java.util.ArrayList;

public class Year3_IT {
    private ArrayList<Courses> courses = new ArrayList<Courses>(); 

    public ArrayList<Courses> getList(){ 
        Courses info1600 = new Courses("INFO 1600",3,null,"Introduction to Information Technology Concepts"); 
        Courses math2250 = new Courses("MATH 2250", 3, null, "Industrial Statistics"); 
        Courses comp3605 = new Courses("COMP 3605", 3, null, "Introduction to Data Analytics");   
        Courses info2600 = new Courses("INFO 2600", 3, info1600, "Information Systems Development");

        Courses info3605 = new Courses("INFO 3605", 3, math2250, "Intro to Data Analytics"); 
        Courses info3606 = new Courses("INFO 3606", 3, comp3605, "Cloud Computing"); 
        Courses info3607 = new Courses("INFO 3607", 3, comp3605, "Fundamentals of WAN Technologies"); 
        Courses info3608 = new Courses("INFO 3608", 3, info2600, "E-Commerce"); 
        Courses info3609 = new Courses("INFO 3609", 3, info2600, "Internship I"); 
        Courses info3610 = new Courses("INFO 3610", 3, info2600, "Internship II"); 

        courses.add(info3605); 
        courses.add(info3608); 
        courses.add(info3606);
        courses.add(info3607);         
        courses.add(info3609); 
        courses.add(info3610);   

        return courses;
    }//end
}//end

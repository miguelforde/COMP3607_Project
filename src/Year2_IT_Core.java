import java.util.ArrayList;

public class Year2_IT_Core{ 
    private ArrayList<Courses> courses = new ArrayList<Courses>(); 

    public ArrayList<Courses> getList(){ 
        Courses comp1601 = new Courses("COMP 1601",3,null,"Computer Programming I"); 
        Courses info1600 = new Courses("INFO 1600",3,null,"Introduction to Information Technology Concepts"); 
        Courses comp1602 = new Courses("COMP 1602",3,null,"Computer Programming II"); 
        Courses info1601 = new Courses("INFO 1601",3,null,"Introduction to WWW Programming"); 

        Courses comp2605 = new Courses("COMP 2605", 3, comp1601, "Enterprise Database Systems"); 
        Courses info2600 = new Courses("INFO 2600", 3, info1600, "Information Systems Development");
        Courses info2601 = new Courses("INFO 2601", 3, info1600, "Networking Technologies Fundamentals");
        Courses info2603 = new Courses("INFO 2603", 3, info1600, "Platform Technologies"); 
        
        courses.add(info1600); 
        courses.add(comp1601); 
        courses.add(comp1602);  
        courses.add(info1601); 
        courses.add(comp2605); 
        courses.add(info2600); 
        courses.add(info2601);
        courses.add(info2603);        

        return courses;
    }//end
}//end
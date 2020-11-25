import java.util.ArrayList;

public class Year2_IT_Elec {
    private ArrayList<Courses> courses = new ArrayList<Courses>(); 

    public ArrayList<Courses> getList(){ 
        Courses info1600 = new Courses("INFO 1600",3,null,"Introduction to Information Technology Concepts"); 
        Courses comp1602 = new Courses("COMP 1602",3,null,"Computer Programming II"); 
        Courses info1601 = new Courses("INFO 1601",3,null,"Introduction to WWW Programming"); 

        Courses comp2602 = new Courses("INFO 2602", 3, info1601, "Web Programming and Technologies I"); 
        Courses info2604 = new Courses("INFO 2604", 3, comp1602, "Information Systems Security");
        Courses info2605 = new Courses("INFO 2605", 3, info1600, "Professional Ethics and Law");
        Courses math2250 = new Courses("MATH 2250", 3, null, "Industrial Statistics"); 
        
        courses.add(comp2602); 
        courses.add(info2604); 
        courses.add(info2605);
        courses.add(math2250);        

        return courses;
    }//end
}//end

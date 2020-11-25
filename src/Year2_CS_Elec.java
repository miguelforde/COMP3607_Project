import java.util.ArrayList;

public class Year2_CS_Elec {

    private ArrayList<Courses> courses = new ArrayList<Courses>(); 

    public ArrayList<Courses> getList(){ 
        Courses comp1601 = new Courses("COMP 1601",3,null,"Computer Programming I"); 
        Courses comp1600 = new Courses("COMP 1600",3,null,"Introduction to Computing Concepts"); 
        Courses comp1603 = new Courses("COMP 1603",3,null,"Computer Programming III"); 
        Courses comp2602 = new Courses("COMP 2602", 3, comp1600, "Computer Networks"); 
        Courses comp2605 = new Courses("COMP 2605", 3, comp1601, "Enterprise Database Systems");
        Courses comp2606 = new Courses("COMP 2606", 3, comp1603, "Software Engineering I");  
        Courses math2250 = new Courses("MATH 2250", 3, null, "Industrial Statistics");

        courses.add(comp2602); 
        courses.add(comp2605); 
        courses.add(comp2606);       
        courses.add(math2250);

        return courses;
    }//end
}//end

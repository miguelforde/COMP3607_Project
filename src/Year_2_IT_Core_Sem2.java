import java.util.ArrayList;

public class Year_2_IT_Core_Sem2 {
    private ArrayList<Courses> courses = new ArrayList<Courses>(); 

    public ArrayList<Courses> getList(){ 
        Courses info1600 = new Courses("INFO 1600",3,null,"Introduction to Information Technology Concepts"); 

        Courses info2600 = new Courses("INFO 2600", 3, info1600, "Information Systems Development");

        courses.add(info2600); 

        return courses;
    }//end
}

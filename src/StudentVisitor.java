import java.util.ArrayList;

public class StudentVisitor implements Visitor { 
    Department cs = new Department();  
    Department it = new Department(); 

    public StudentVisitor(){  
        ArrayList<Courses> CSList = new ArrayList<Courses>(); 
        CSList.addAll(new Year2_CS_Core().getList()); 
        CSList.addAll(new Year2_CS_Elec().getList()); 
        CSList.addAll(new Year3_CS().getList());  
        CSList.addAll(new Year2_IT_Elec().getList());  
        CSList.addAll(new Year3_IT().getList());
        
        for(Courses obj: CSList) cs.addCourse(obj); 

        ArrayList<Courses> ITList = new ArrayList<Courses>(); 
        ITList.addAll(new Year2_IT_Core().getList()); 
        ITList.addAll(new Year2_IT_Elec().getList()); 
        ITList.addAll(new Year3_IT().getList());  
        ITList.addAll(new Year2_CS_Elec().getList()); 
        ITList.addAll(new Year3_CS().getList());
        
        for(Courses obj: ITList) it.addCourse(obj);
    }//end  

    public void visit(StudentCS student){  
       System.out.println(student.getCompletedCourses()); 
       cs.getAvailable(student); 
    }//end visit()

    public void visit(StudentIT student){  
        System.out.println(student.getCompletedCourses()); 
        it.getAvailable(student);

    }//end visit() 
    
}//end StudentVisitor()

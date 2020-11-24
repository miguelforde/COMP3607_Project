import java.util.ArrayList;

public class CSVisitor implements Visitor { 
    public CSVisitor(){ 
        Department CS = new Department(); 
        ArrayList<Courses> CSList = new ArrayList<Courses>(); 
        CSList.addAll(new Year2_CS_Core().getList()); 
        CSList.addAll(new Year2_CS_Elec().getList()); 
        CSList.addAll(new Year3_CS().getList()); 
    }//end  

    public void visit(StudentCS student){ 

    }//end visit()

    public void visit(StudentIT student){ 

    }//end visit() 
    
}//end StudentVisitor()

public class App {
    public static void main(String[] args) throws Exception {
        StudentCS stu =  new StudentCS("Mark", "BSc Chemistry", 2.67); 
        Courses comp1601 = new Courses("COMP 1601",3,null,"Computer Programming I"); 
        Courses comp1600 = new Courses("COMP 1600",3,null,"Introduction to Computing Concepts"); 
        Courses comp1602 = new Courses("COMP 1602",3,null,"Computer Programming II");   
        Courses comp1603 = new Courses("COMP 1603",3,null,"Computer Programming III"); 
        Courses comp2603 = new Courses("COMP 2603", 3, comp1603, "Object-Oriented Programming I");  
        Courses comp2611 = new Courses("COMP 2611", 3, comp1603, "Data Structures");   
        Courses comp2604 = new Courses("COMP 2604", 3, comp1600, "Operating Systems"); 
        Courses comp2606 = new Courses("COMP 2606", 3, comp1603, "Software Engineering I"); 
        Courses comp2602 = new Courses("COMP 2602", 3, comp1600, "Computer Networks");

        stu.setCompletedCourses(comp1601);  
        stu.setCompletedCourses(comp1600); 
        stu.setCompletedCourses(comp1602);  
        stu.setCompletedCourses(comp1603);
        stu.setCompletedCourses(comp2603); 
        stu.setCompletedCourses(comp2611); 
        stu.setCompletedCourses(comp2604); 
        stu.setCompletedCourses(comp2606); 
        stu.setCompletedCourses(comp2602); 

        StudentVisitor csCourses = new StudentVisitor(); 
        stu.accept(csCourses);

    }//end main()   
}//end

import java.util.ArrayList;

public class Year3_CS {
    private ArrayList<Courses> courses = new ArrayList<Courses>(); 

    public ArrayList<Courses> getList(){   
        Courses comp1600 = new Courses("COMP 1600",3,null,"Introduction to Computing Concepts"); 
        Courses comp1603 = new Courses("COMP 1603",3,null,"Computer Programming III"); 
        Courses comp2603 = new Courses("COMP 2603", 3, comp1603, "Object-Oriented Programming I");
        Courses comp2611 = new Courses("COMP 2611", 3, comp1603, "Data Structures"); 
        Courses comp2606 = new Courses("COMP 2604", 3, comp1603, "Software Engineering");  
        Courses comp2602 = new Courses("COMP 2602", 3, comp1600, "Computer Networks"); 
        Courses comp3601 = new Courses("COMP 3601", 3, comp2611, "Design and Analysis of Algorithms");
        Courses comp3602 = new Courses("COMP 3602", 3, comp2611, "Theory of Computing"); 
        Courses comp3603 = new Courses("COMP 3603", 3, comp2606, "Human Computer Interaction"); 
        Courses comp3605 = new Courses("COMP 3605", 3, null, "Introduction to Data Analytics"); 
        Courses comp3606 = new Courses("COMP 3606", 3, comp2602, "Wireless and Mobile Computing"); 
        Courses comp3607 = new Courses("COMP 3607", 3, comp2603, "Object Oriented Programming II"); 
        Courses comp3608 = new Courses("COMP 3608", 3, comp2611, "Intelligent Systems"); 
        Courses comp3609 = new Courses("COMP 3609", 3, comp2603, "Game Programming"); 
        Courses comp3610 = new Courses("COMP 3610", 3, comp2606, "Big Data Anaylytics"); 
        Courses comp3611 = new Courses("COMP 3611", 3, null, "Modelling and Simulation"); 
        Courses comp3612 = new Courses("COMP 3612", 3, comp2611, "Special Topics in Computer Science"); 
        Courses comp3613 = new Courses("COMP 3613", 3, comp2606, "Software Engineering II");  

        courses.add(comp3601);  
        courses.add(comp3602);  
        courses.add(comp3603);  
        courses.add(comp3605);  
        courses.add(comp3606);  
        courses.add(comp3607); 
        courses.add(comp3608);  
        courses.add(comp3609); 
        courses.add(comp3610);  
        courses.add(comp3611);  
        courses.add(comp3612);  
        courses.add(comp3613);   
  
        return courses;
    } //end 
}//end

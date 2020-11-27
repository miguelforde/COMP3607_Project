import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
public class FilePicker {  
    private Stage stage; 

    public FilePicker(Stage stage){ 
        this.stage = stage;
    }//end 

    
    public Student readFile(){  
        ArrayList<String> studentFile = new ArrayList<>();
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        File file = fileChooser.showOpenDialog(stage);
        if (file != null) {
            studentFile = loadStudent(file); 
            return initStudent(studentFile);
        }//end if 
        System.out.println(studentFile); 
        return null;
    }//end readFile() 

    public ArrayList<String> loadStudent(File file){   
        ArrayList<String> fileInfo = new ArrayList<String>(); 
        try{
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) fileInfo.add(scanner.nextLine());
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }//end catchBlock

        return fileInfo;
    }//end loadStudent()  

    public Student initStudent(ArrayList<String> studentInfo){  

        if (studentInfo.get(2).equals("Computer Science")){  
            StudentCS student = new StudentCS(studentInfo.get(0), studentInfo.get(1), Double.valueOf(studentInfo.get(3)), csComplete(studentInfo));
            return student;
        }else{ 
            StudentIT student = new StudentIT(studentInfo.get(0), studentInfo.get(1), Double.valueOf(studentInfo.get(3)), itComplete(studentInfo));
            return student;
        }//end if
    }//end

    public ArrayList<Courses> csComplete(ArrayList<String> studentInfo){  
        ArrayList<Courses> studentCourses = new ArrayList<Courses>(); 
        ArrayList<Courses> csCourses = new initCSDepartment().initDepartment();
        ListIterator<String> it = studentInfo.listIterator(4);
        while (it.hasNext()) { 
            String temp = it.next();
            for(Courses obj: csCourses){  
                if (obj.getCourseCode().equals(temp) ){ 
                    studentCourses.add(obj);
                }//end if
            }//end for
        }//end 
        return studentCourses;
    }//end   

    public ArrayList<Courses> itComplete(ArrayList<String> studentInfo){  
        ArrayList<Courses> studentCourses = new ArrayList<Courses>(); 
        ArrayList<Courses> itCourses = new initITDepartment().initDepartment();
        ListIterator<String> it = studentInfo.listIterator(4);
        while (it.hasNext()) { 
            String temp = it.next();
            for(Courses obj: itCourses){  
                if (obj.getCourseCode().equals(temp) ){ 
                    studentCourses.add(obj);
                }//end if
            }//end for
        }//end 
        return studentCourses;
    }//end  

}//end FilePicker()

    

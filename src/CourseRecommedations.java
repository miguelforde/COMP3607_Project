import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class CourseRecommedations {
    
    public void display(Student student) { 
        Stage window = new Stage(); 
        window.initModality(Modality.APPLICATION_MODAL); 
    
        BorderPane root = new BorderPane();
    
        root.setPadding(new Insets(15, 20, 10, 10));
    
        // TOP
        Text text = new Text(); 
        text.setText(student.getName()+"\n"+student.getMajor()+" Minor in "+student.getMinor()+"\n");
        root.setTop(text);  
        // Set margin for top area.
        BorderPane.setMargin(text, new Insets(10, 10, 10, 10));  
        BorderPane.setAlignment(text, Pos.TOP_CENTER);
        
    
        // LEFT  
        GridPane grid3 = new GridPane();
        grid3.setHgap(10);
        grid3.setVgap(12);
        Text text2 = new Text();      
        int z= 0;
        for(Courses obj:  student.getCompletedCourses()){  
            Text tmp = new Text(); 
            tmp.setText(obj.getCourseCode());    
            grid3.add(tmp,0,z);  
            z = z+2;
        }//end  

        // Set margin for left area.
        root.setLeft(grid3);
        BorderPane.setMargin(grid3, new Insets(10, 10, 10, 10));  
        BorderPane.setAlignment(grid3, Pos.CENTER_LEFT); 

        // CENTER 
        StudentVisitor csCourses = new StudentVisitor();    
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(12);
        ArrayList<RegisterLink> semOneRegister = new ArrayList<RegisterLink>();
        StringBuilder availableField = new StringBuilder("Semester 1 Courses\n");  
            student.accept(csCourses); 
            for(Courses obj : student.getAvailableCourses()){   
                for(Courses obj2 : new initCSDepartment().getSem1()){
                    if(obj.getCourseCode().equals(obj2.getCourseCode())){  
                        semOneRegister.add(new RegisterLink(obj,student,root));
                        availableField.append(obj.getCourseCode() + "\n"); 
                    } 

                }
                //availableField.append(obj.getCourseCode() + "\n"); 
        // Set margin for left area.
            }//end for  
        int x= 0;
        for(RegisterLink obj: semOneRegister){  
            Text tmp = new Text(); 
            tmp.setText(obj.getCourse().getCourseCode());    
            grid.add(tmp,0,x); 
            grid.add(obj.getLink(),1,x); 
            x++;
        }//end  


        Text text4 = new Text();  
        text4.setText(availableField.toString());
        root.setCenter(grid); 
        BorderPane.setMargin(grid, new Insets(10, 10, 10, 10));
        // Alignment.
        BorderPane.setAlignment(grid, Pos.CENTER); 

        
        GridPane grid2 = new GridPane();
        grid2.setHgap(10);
        grid2.setVgap(12);

        ArrayList<RegisterLink> semtwoRegister = new ArrayList<RegisterLink>();
        StringBuilder availableField2 = new StringBuilder("Semester 2 Courses\n"); 
            for(Courses obj3 : student.getAvailableCourses()){   
                for(Courses obj4 : new initCSDepartment().getSem2()){
                    if(obj4.getCourseCode().equals(obj3.getCourseCode())){
                        semtwoRegister.add(new RegisterLink(obj4,student,root));
                        availableField2.append(obj3.getCourseCode() +"\n"); 
                        }
                    }
                //availableField.append(obj.getCourseCode() + "\n"); 
        // Set margin for left area.
            }   
            int y= 0;
            for(RegisterLink obj: semtwoRegister){  
                Text tmp = new Text(); 
                tmp.setText(obj.getCourse().getCourseCode());    
                grid2.add(tmp,0,y); 
                grid2.add(obj.getLink(),1,y); 
                y++;
            }//end  
        
        Text text3 = new Text();  
        text3.setText(availableField2.toString());
        root.setRight(grid2); 
        BorderPane.setMargin(grid2, new Insets(10, 10, 10, 10)); 
        // Alignment.
        BorderPane.setAlignment(grid2, Pos.CENTER_RIGHT);
    
        // RIGHT
  
    
        // BOTTOM 
        // Alignment.
        //BorderPane.setAlignment(btnBottom, Pos.TOP_RIGHT);
    
        // Set margin for bottom area.
    
        Scene scene = new Scene(root, 1000, 600);
    
        //primaryStage.setTitle("BorderPane Layout Demo");
        window.setScene(scene);  
        window.showAndWait();

    } 

 
}//end

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
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
        text.setText(student.getName()+"\n"+student.getMajor()+" Minor in "+student.getMinor()+"\n"+student.getGpa());
        root.setTop(text);  
        // Set margin for top area.
        BorderPane.setMargin(text, new Insets(10, 10, 10, 10));  
        BorderPane.setAlignment(text, Pos.TOP_CENTER);
        
    
        // LEFT 
        Text text2 = new Text();     
        StringBuilder fieldContent = new StringBuilder("Completed Courses\n"); 
        for(Courses obj : student.getCompletedCourses()){  
            fieldContent.append(obj.getCourseCode() + "\n"); 
        // Set margin for left area.
        }  
        text2.setText(fieldContent.toString());
        root.setLeft(text2);
        BorderPane.setMargin(text2, new Insets(10, 10, 10, 10));  
        BorderPane.setAlignment(text2, Pos.CENTER_LEFT); 

        // CENTER 
        StudentVisitor csCourses = new StudentVisitor();  
        StringBuilder availableField = new StringBuilder("Semester 1 Courses\n"); 
        if(student instanceof StudentCS){ 
            ((StudentCS) student).accept(csCourses); 
            for(Courses obj : ((StudentCS) student).getAvailableCourses()){   
                for(Courses obj2 : new initCSDepartment().getSem1()){
                    if(obj.getCourseCode().equals(obj2.getCourseCode())) availableField.append(obj.getCourseCode() + "\n"); 
                }
                //availableField.append(obj.getCourseCode() + "\n"); 
        // Set margin for left area.
            }  
        }//end if 
        
        Text text4 = new Text();  
        text4.setText(availableField.toString());
        root.setCenter(text4); 
        BorderPane.setMargin(text4, new Insets(10, 10, 10, 10));
        // Alignment.
        BorderPane.setAlignment(text4, Pos.CENTER); 

        


        StringBuilder availableField2 = new StringBuilder("Semester 2 Courses\n"); 
        if(student instanceof StudentCS){ 
            //((StudentCS) student).accept(csCourses); 
            for(Courses obj3 : ((StudentCS) student).getAvailableCourses()){   
                for(Courses obj4 : new initCSDepartment().getSem2()){
                    if(obj4.getCourseCode().equals(obj3.getCourseCode())) availableField2.append(obj3.getCourseCode() + "\n"); 
                }
                //availableField.append(obj.getCourseCode() + "\n"); 
        // Set margin for left area.
            }  
        }//end if 
        
        Text text3 = new Text();  
        text3.setText(availableField2.toString());
        root.setRight(text3); 
        BorderPane.setMargin(text3, new Insets(10, 10, 10, 10)); 
        // Alignment.
        BorderPane.setAlignment(text3, Pos.CENTER_RIGHT);
    
        // RIGHT
  
    
        // BOTTOM
        Button btnBottom = new Button("Bottom");
        btnBottom.setPadding(new Insets(5, 5, 5, 5));
        root.setBottom(btnBottom);
        // Alignment.
        //BorderPane.setAlignment(btnBottom, Pos.TOP_RIGHT);
    
        // Set margin for bottom area.
        BorderPane.setMargin(btnBottom, new Insets(10, 10, 10, 10));
    
        Scene scene = new Scene(root, 550, 250);
    
        //primaryStage.setTitle("BorderPane Layout Demo");
        window.setScene(scene);  
        window.showAndWait();

    }
 
}//end

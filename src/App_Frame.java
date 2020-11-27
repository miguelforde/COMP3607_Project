import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App_Frame extends Application { 

    @Override
    public void start(Stage primaryStage) {  
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        VBox root = new VBox();
        root.getChildren().add(btn);

    
        Scene scene = new Scene(root, 300, 250);

        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
               FilePicker fPicker = new FilePicker(primaryStage); 
               Student student = fPicker.readFile(); 
               for(Courses obj: student.getCompletedCourses()) System.out.println(obj.getCourseCode());
            }
        });



        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 public static void main(String[] args) {
        launch(args);
    }
}

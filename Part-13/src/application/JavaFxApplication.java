package application;
import javafx.application.Application;
import javafx.stage.Stage;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.TextField;

public class JavaFxApplication extends Application{

    @Override
    public void start(Stage window)  {
        Button button = new Button("This is a button");
        TextField textfield = new TextField("This is initial text field");

        FlowPane componentGroup = new FlowPane();
        componentGroup.getChildren().add(button);
        componentGroup.getChildren().add(textfield);
//        componentGroup.getChildren().add(textComponent);

        Scene scene = new Scene(componentGroup);


        window.setTitle("hello world");
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(JavaFxApplication.class);
    }
}

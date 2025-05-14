package application;
import javafx.application.Application;
import javafx.stage.Stage;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class JavaFxApplication extends Application{

    @Override
    public void start(Stage window)  {

        //HBox for horizontal row;
        VBox layout = new VBox();
        layout.getChildren().add(new Label("first"));
        layout.getChildren().add(new Label("second"));
        layout.getChildren().add(new Label("third"));
        layout.setSpacing(10);

        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(JavaFxApplication.class);
    }
}

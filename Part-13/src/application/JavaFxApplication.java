package application;
import javafx.application.Application;
import javafx.stage.Stage;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;

public class JavaFxApplication extends Application{

    @Override
    public void start(Stage window)  {

        BorderPane layout = new BorderPane();
        layout.setTop(new Label("NORTH"));
        layout.setBottom(new Label("SOUTH"));
        layout.setLeft(new Label("WEST"));
        layout.setRight(new Label("EAST"));
        layout.setCenter(new Label("CENTER"));

        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(JavaFxApplication.class);
    }
}

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
        layout.setTop(new Label("Top"));
        layout.setBottom(new Label("Bottom"));
        layout.setLeft(new Label("Left"));
        layout.setRight(new Label("Right"));

        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(JavaFxApplication.class);
    }
}

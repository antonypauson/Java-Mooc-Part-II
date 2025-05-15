package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class MyApplication extends Application {

    @Override
    public void start(Stage window) {

        Button button = new Button("Click here!");
        BorderPane layout = new BorderPane();

        button.setOnAction((event) -> {
            System.out.println("Pressed the button!");
        });

        layout.setCenter(button);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.setTitle("My first application");

        window.show();
    }

    public static void main(String[] args) {
        launch(MyApplication.class);
    }
}
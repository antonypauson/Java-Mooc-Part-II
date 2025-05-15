package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Notifier extends Application {

    @Override
    public void start(Stage window) {

        TextField textField = new TextField();
        Button button = new Button("UPDATE");
        Label label = new Label();

        VBox layout = new VBox();
        layout.getChildren().addAll(textField, button, label);


        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();

    }

    public static void main(String[] args) {
        launch(Notifier.class);
    }
}

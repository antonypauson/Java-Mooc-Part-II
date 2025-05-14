package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import javafx.scene.layout.BorderPane;

import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
public class TextStatistics extends Application {

    @Override
    public void start(Stage window) throws Exception {
        BorderPane layout = new BorderPane();

        TextField textField = new TextField("Type here..");
        HBox bottomComponents = new HBox();
        bottomComponents.setSpacing(10);
        bottomComponents.getChildren().add(new Label("Letters: 0"));
        bottomComponents.getChildren().add(new Label("Words: 0"));
        bottomComponents.getChildren().add(new Label("The longest word is: "));

        layout.setBottom(bottomComponents);
        layout.setCenter(textField);
        Scene view = new Scene(layout);

        window.setScene(view);
        window.setTitle("Text Statistics");
        window.show();
    }

    public static void main(String[] args) {
        launch(TextStatistics.class);
    }
}

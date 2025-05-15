package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import javafx.scene.layout.BorderPane;

import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.Arrays;

public class TextStatistics extends Application {

    @Override
    public void start(Stage window) throws Exception {
        BorderPane layout = new BorderPane();

        TextField textField = new TextField("Type here..");
        HBox bottomComponents = new HBox();
        bottomComponents.setSpacing(10);

        Label label1 = new Label("Letters: 0");
        Label label2 = new Label("Words: 0");
        Label label3 = new Label("The longest word is: ");

        bottomComponents.getChildren().add(label1);
        bottomComponents.getChildren().add(label2);
        bottomComponents.getChildren().add(label3);

        textField.textProperty().addListener((change, oldValue, newValue) -> {
            String[] words = newValue.split(" ");
            String longest = Arrays.stream(words)
                    .sorted((s1,s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
            label3.setText("The longest word is: " + longest);
            label2.setText("Words: " + words.length);
            label1.setText("Letters: " + newValue.length());
        });
        layout.setBottom(bottomComponents);
        layout.setCenter(textField);
        Scene view = new Scene(layout);

        window.setScene(view);
//        window.setTitle("Text Statistics");
        window.show();
    }

    public static void main(String[] args) {
        launch(TextStatistics.class,
                "--organization=Once upon a time",
                "--course=Title");
    }
}

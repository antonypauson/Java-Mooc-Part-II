package application;

import javafx.application.Application;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class EventHandling extends Application {

    @Override
    public void start(Stage window) {
        TextField leftText = new TextField("type here");
        TextField rightText = new TextField();
        Button button = new Button("COPY");

        button.setOnAction((event) -> {
            rightText.setText(leftText.getText());
        });
        HBox componentGroup = new HBox();
        componentGroup.setSpacing(20);
        componentGroup.getChildren().addAll(leftText, button, rightText);

        Scene scene = new Scene(componentGroup);
        window.setScene(scene);
        window.setTitle("My first application");
        window.show();
    }

    public static void main(String[] args) {
        launch(EventHandling.class);
    }
}
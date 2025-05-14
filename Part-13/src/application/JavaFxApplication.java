package application;
import javafx.application.Application;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;

public class JavaFxApplication extends Application{

    @Override
    public void start(Stage window)  {

        BorderPane layout = new BorderPane();
        HBox buttons = new HBox();
        buttons.setSpacing(10);
        buttons.getChildren().add(new Button("First"));
        buttons.getChildren().add(new Button("Second"));
        buttons.getChildren().add(new Button("Third"));

        VBox text = new VBox();
        text.getChildren().add((new Label("First")));
        text.getChildren().add(new Label("Second"));
        text.getChildren().add(new Label("Third"));

        layout.setTop(buttons);
        layout.setLeft(text);
        layout.setCenter(new TextArea(" "));
        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(JavaFxApplication.class);
    }
}

package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.border.Border;

public class MultipleViews extends Application {

    @Override
    public void start(Stage window) throws Exception {
        //layout + controls
        BorderPane bp = new BorderPane();
        TextField tf1 = new TextField("First View!");
        Button button1 = new Button("To the second view");
        //first view
        bp.setTop(tf1);
        bp.setCenter(button1);
        //first view
        Scene first = new Scene(bp);


        //second layout + controls
        VBox vbox = new VBox();
        Button button2 = new Button("To the third view");
        TextField tf2 = new TextField("Second view!");
        vbox.getChildren().addAll(button2, tf2);
        //second view
        Scene second = new Scene(vbox);

        //third layout + controls
        GridPane gp = new GridPane();
        gp.add(new Label("Third view"),0,0);
        Button button3 = new Button("To the first view");
        gp.add(button3, 1, 1);

        Scene third = new Scene(gp);

        //switch on clicking
        button1.setOnAction((event) -> {
            window.setScene(second);
        });
        button2.setOnAction((event) -> {
            window.setScene(third);
        });
        button3.setOnAction((event) -> {
            window.setScene(first);
        });
        window.setScene(first);
        window.show();
    }

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }
}

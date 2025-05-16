package linecharts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class SavingsCalculator extends Application {

    @Override
    public void start(Stage window) throws Exception {

        Button button = new Button("Click here!");
        BorderPane layout = new BorderPane();


        layout.setCenter(button);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.setTitle("Savings Calculator");
        window.show();
    }

    public static void main(String[] args) {
        launch(SavingsCalculator.class);
    }
}

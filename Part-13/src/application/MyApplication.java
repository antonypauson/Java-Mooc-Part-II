package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

import java.util.Scanner;

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

        Parameters params = getParameters();
        String title = params.getNamed().get("title");

        window.setTitle(title);
        window.show();
    }

    public static void main(String[] args) {
        System.out.println("Enter the title: ");
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();

        launch(MyApplication.class, "--title=" + title);
    }
}
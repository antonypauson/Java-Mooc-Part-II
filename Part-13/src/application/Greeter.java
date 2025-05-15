package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;


public class Greeter extends Application {

    @Override
    public void start(Stage window) throws Exception {
        //creating layout + controls
        Label instructionText = new Label("Write username and password!");
        TextField userName = new TextField();
        PasswordField passwordField = new PasswordField();
        Button loginButton = new Button("Login");
        Label errorMessage = new Label("");

        GridPane homeLayout = new GridPane();
        homeLayout.add(instructionText, 0, 0);
        homeLayout.add(userName, 0, 1);
        homeLayout.add(passwordField, 0,2);
        homeLayout.add(loginButton, 0, 3);
        homeLayout.add(errorMessage, 0, 4);

        homeLayout.setPrefSize(300, 180);
        homeLayout.setAlignment(Pos.CENTER);
        homeLayout.setVgap(10);
        homeLayout.setHgap(10);
        homeLayout.setPadding(new Insets(20, 20, 20, 20));

        Scene loginView = new Scene(homeLayout);



        loginButton.setOnAction((event) -> {
            if (!passwordField.getText().trim().equals("password")) {
                errorMessage.setText("Incorrect password");
                userName.setText("");
                passwordField.setText("");
                return;
            }
            Label welcomeText = new Label("Welcome, " + userName.getText());

            StackPane welcomeLayout = new StackPane();
            welcomeLayout.setPrefSize(300, 180);
            welcomeLayout.getChildren().add(welcomeText);
            welcomeLayout.setAlignment(Pos.CENTER);

            Scene welcomeScene = new Scene(welcomeLayout);
            window.setScene(welcomeScene);
        });

        window.setScene(loginView);
        window.show();
    }

    public static void main(String[] args) {
        launch(Greeter.class);
    }
}

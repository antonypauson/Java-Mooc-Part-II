package application.largerapps;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PersonApp extends Application {

    @Override
    public void start(Stage window) throws Exception {

        //MyPersonWarehouse is a dummy class
        //for demo purposes
        PersonWarehouse warehouse = new MyPersonWarehouse();

        Label nameLabel = new Label("Name: ");
        TextField nameField = new TextField();
        Label socialLabel = new Label("Social security number: ");
        TextField socialField = new TextField();
        Button addButton = new Button("Add person");

        //button event handling
        addButton.setOnAction((event) -> {
            warehouse.save(new Person(nameField.getText(), socialField.getText()));
        });

        GridPane components = new GridPane();
        components.add(nameLabel, 0, 0);
        components.add(nameField, 1, 0);

        components.add(socialLabel, 0,1);
        components.add(socialField, 1, 1);

        components.add(addButton, 0,2);

        components.setHgap(10);
        components.setVgap(10);
        components.setPadding(new Insets(10, 10, 10, 10));

        Scene scene = new Scene(components);

        window.setScene(scene);
        window.show();


    }

    public static void main(String[] args) {
        launch(PersonApp.class);
    }
}

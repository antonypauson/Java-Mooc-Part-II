package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ExampleApplication extends Application {

    @Override
    public void start(Stage window) throws Exception {
        BorderPane layout = new BorderPane();

        HBox menu = new HBox();
        menu.setPadding(new Insets(20,20,20,20));
        menu.setSpacing(10);

        Button first = new Button("First");
        Button second = new Button("Second");

        menu.getChildren().addAll(first, second);
        layout.setTop(menu);

        StackPane firstLayout = createView("First view");
        StackPane secondLayout = createView("Second view");

        first.setOnAction((event) -> {
            layout.setCenter(firstLayout);
        });

        second.setOnAction((event) -> {
            layout.setCenter(secondLayout);
        });

        layout.setCenter(firstLayout);


        Scene scene = new Scene(layout);

        window.setScene(scene);
        window.show();
    }

    private StackPane createView(String text) {
        StackPane layout = new StackPane();
        layout.setPrefSize(300, 180);
        layout.getChildren().add(new Label(text));
        layout.setAlignment(Pos.CENTER);

        return layout;
    }
    public static void main(String[] args) {
        launch(ExampleApplication.class);
    }
}

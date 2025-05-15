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

public class JokeApplication extends Application {

    @Override
    public void start(Stage window) throws Exception {

        //the full layout
        BorderPane layout = new BorderPane();

        //layout for buttons
        HBox menu = new HBox();
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);

        //three buttons
        Button firstButton = new Button("Joke");
        Button secondButton = new Button("Answer");
        Button thirdButton = new Button("Explanation");

        //add these buttons to HBox
        menu.getChildren().addAll(firstButton, secondButton, thirdButton);

        //add HBox to BorderPane
        layout.setTop(menu);

        //separate layouts for each button
        StackPane firstLayout = createView("Why England always loose in chess? ");
        StackPane secondLayout = createView("They lost their queen");
        StackPane thirdLayout = createView("The Queen of England died last year");

        //event handling for buttons
        firstButton.setOnAction((event) -> layout.setCenter(firstLayout));
        secondButton.setOnAction((event) -> layout.setCenter(secondLayout));
        thirdButton.setOnAction((event) -> layout.setCenter(thirdLayout));

        layout.setCenter(firstLayout);

        Scene scene = new Scene(layout);

        window.setScene(scene);
        window.show();

    }

    public StackPane createView(String text) {
        StackPane layout = new StackPane();
        layout.setPrefSize(300, 180);
        layout.getChildren().add(new Label(text));
        layout.setAlignment(Pos.CENTER);
        return layout;
    }

    public static void main(String[] args) {
        launch(JokeApplication.class);
    }
}

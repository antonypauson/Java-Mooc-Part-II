package application.vocabulary;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class PracticeApplication extends Application {

    private Dictionary dictionary;
    @Override
    public void init() throws Exception {
        this.dictionary = new Dictionary();
    }

    @Override
    public void start(Stage stage) throws Exception {
        //call our two views
        InputView inputView = new InputView(dictionary);
        PracticeView practiceView = new PracticeView(dictionary);

        //layout
        BorderPane layout = new BorderPane();

        //menu mini layout
        HBox menu = new HBox();
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);

        //buttons
        Button inputButton = new Button("Enter new words");
        Button practiceButton = new Button("Practice");

        //add buttons to menu
        menu.getChildren().addAll(inputButton, practiceButton);
        layout.setTop(menu);

        //button event handling
        inputButton.setOnAction((event) -> {
            layout.setCenter(inputView.getView());
        });
        practiceButton.setOnAction((event) -> {
            PracticeView practiceView1 = new PracticeView(dictionary);
            layout.setCenter(practiceView1.getView());
        });

        layout.setCenter(inputView.getView());

        Scene view = new Scene(layout, 400, 300);

        stage.setScene(view);
        stage.show();

    }

    public static void main(String[] args) {
        launch(PracticeApplication.class);
    }
}

package application.vocabulary;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class InputView {
    private Dictionary dictionary;

    public InputView(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public Parent getView() {
        GridPane layout = new GridPane();

        Label wordLabel = new Label("Word:");
        TextField wordField = new TextField();
        Label transLabel = new Label("Translation:");
        TextField transField = new TextField();

        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(10, 10, 10, 10));

        Button addButton = new Button("Add the word-translation");

        layout.add(wordLabel, 0, 0);
        layout.add(wordField,0,1);
        layout.add(transLabel, 0,2);
        layout.add(transField,0,3);
        layout.add(addButton,0,4);

        addButton.setOnAction((event) -> {
            String word = wordField.getText();
            String trans = transField.getText();
            this.dictionary.add(word,trans);

            System.out.println(word + "-> " + trans);

            wordField.clear();
            transField.clear();
        });
        return layout;
    }
}

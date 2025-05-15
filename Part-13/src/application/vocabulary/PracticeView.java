package application.vocabulary;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class PracticeView {
    private Dictionary dictionary;
    private String word;

    public PracticeView(Dictionary dictionary) {
        this.dictionary = dictionary;
        this.word = dictionary.getRandomWord();
    }

    public Parent getView() {
        GridPane layout = new GridPane();

        Label enterTranslationLabel = new Label("Translate the word '" + this.word + "'");
        TextField enterTranslationField = new TextField();

        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(10, 10, 10, 10));

        Button checkButton = new Button("Check:");
        Label messaageLabel = new Label();

        layout.add(enterTranslationLabel, 0, 1);
        layout.add(enterTranslationField, 0, 1);
        layout.add(checkButton, 0, 2);
        layout.add(messaageLabel, 0,3);

        checkButton.setOnAction((event) -> {
            String enteredTrans = enterTranslationField.getText();
            if (dictionary.get(this.word).equals(enteredTrans)) {
                messaageLabel.setText("Correct Answer");
            } else {
                messaageLabel.setText("Incorrect Answer. Real translation of '" + word + "' is " + dictionary.get(word));
                return;
            }

            this.word = this.dictionary.getRandomWord();
            enterTranslationLabel.setText("Translate the word '" + this.word + "'");
            enterTranslationField.clear();
        });
        return layout;
    }
}

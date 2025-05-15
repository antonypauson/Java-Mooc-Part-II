package application.tictactoe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.util.ArrayList;
import java.util.List;

public class TicTacToeApplication extends Application {
    String currentPlayer = "X";
    List<Button> buttons = new ArrayList<>();

    @Override
    public void start(Stage stage) throws Exception {

    }

    public void takeTurn() {
        if (currentPlayer.equals("X")) {
            currentPlayer = "0";
        } else if (currentPlayer.equals("0")) {
            currentPlayer = "X";
        }
    }

    public boolean allBoxesAreFilled() {
        for (Button b : buttons) {
            if (b.getText().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public boolean checkIfWinner() {
        return checkVerticalColumns() ||
                checkHorizontalRows() ||
                checkDiagonals();
    }

    public boolean checkVerticalColumns() {
        if ((!buttons.get(0).getText().isEmpty()) &&
                (buttons.get(0).getText().equals(buttons.get(3).getText()))
                && (buttons.get(0).getText().equals(buttons.get(6).getText())) ) {
            return true;
        }

        if ((!buttons.get(1).getText().isEmpty()) &&
                (buttons.get(1).getText().equals(buttons.get(4).getText()))
                && (buttons.get(1).getText().equals(buttons.get(7).getText())) ) {
            return true;
        }

        if ((!buttons.get(2).getText().isEmpty()) &&
                (buttons.get(2).getText().equals(buttons.get(5).getText()))
                && (buttons.get(2).getText().equals(buttons.get(8).getText())) ) {
            return true;
        }

        return false;
    }

    public boolean checkHorizontalRows() {
        if ((!buttons.get(0).getText().isEmpty()) &&
                (buttons.get(0).getText().equals(buttons.get(1).getText()))
                && (buttons.get(0).getText().equals(buttons.get(2).getText())) ) {
                    return true;
        }

        if ((!buttons.get(3).getText().isEmpty()) &&
                (buttons.get(3).getText().equals(buttons.get(4).getText()))
                && (buttons.get(3).getText().equals(buttons.get(5).getText())) ) {
            return true;
        }

        if ((!buttons.get(6).getText().isEmpty()) &&
                (buttons.get(6).getText().equals(buttons.get(7).getText()))
                && (buttons.get(6).getText().equals(buttons.get(8).getText())) ) {
            return true;
        }

        return false;

    }

    public boolean checkDiagonals() {
        if (!buttons.get(0).getText().isEmpty() &&
                (buttons.get(0).getText().equals(buttons.get(4).getText()))
        && (buttons.get(0).getText().equals(buttons.get(8).getText()))) {
            return true;
        }

        if (!buttons.get(2).getText().isEmpty() &&
                (buttons.get(2).getText().equals(buttons.get(4).getText()))
        && (buttons.get(2).getText().equals(buttons.get(6).getText()))) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

}

package application.tictactoe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
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
        BorderPane layout = new BorderPane();
        Label status = new Label("Turn: " + currentPlayer);
        status.setFont(Font.font("Monospaced", 25));

        GridPane gameBoard = new GridPane();
        gameBoard.setPadding(new Insets(10,10,10,10));
        gameBoard.setHgap(10);
        gameBoard.setVgap(10);

        for (int i = 0; i < 9; i++) {
            Button button = new Button();
            button.setFont(Font.font("Monospaced", 25));
            button.setMinSize(70,70);
            button.setMaxSize(70,70);

            button.setOnMouseClicked((event) ->  {
                if (status.getText().startsWith("Winnner: ") || status.getText().equals("Its a draw")) {
                    button.disarm();
                } else if (button.getText().isEmpty()) {
                    button.setText(currentPlayer);
                    if (checkIfWinner()) {
                        status.setText("The end");
                    } else if (allBoxesAreFilled()) {
                        status.setText("Its a draw");
                    } else {
                        takeTurn();
                        status.setText("Turn: " + currentPlayer);
                    }
                }
            });
            buttons.add(button);
        }

        gameBoard.add(buttons.get(0), 0, 0);
        gameBoard.add(buttons.get(1), 0, 1);
        gameBoard.add(buttons.get(2), 0, 2);
        gameBoard.add(buttons.get(3), 1, 0);
        gameBoard.add(buttons.get(4), 1, 1);
        gameBoard.add(buttons.get(5), 1, 2);
        gameBoard.add(buttons.get(6), 2, 0);
        gameBoard.add(buttons.get(7), 2, 1);
        gameBoard.add(buttons.get(8), 2, 2);

        layout.setTop(status);
        layout.setCenter(gameBoard);

        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();
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

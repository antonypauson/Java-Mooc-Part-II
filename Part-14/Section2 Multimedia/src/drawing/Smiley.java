package drawing;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;

import java.awt.*;

public class Smiley extends Application {

    @Override
    public void start(Stage window) {

        Canvas paintingCanvas = new Canvas(640,480);
        GraphicsContext painter = paintingCanvas.getGraphicsContext2D();

        drawSmiley(painter);

        BorderPane layout = new BorderPane();
        layout.setCenter(paintingCanvas);

        Scene scene = new Scene(layout);

        window.setScene(scene);
        window.setTitle("Smiley");
        window.show();
    }

    public static void main(String[] args) {
        launch(Smiley.class);
    }

    public void drawSmiley(GraphicsContext painter) {
        painter.setFill(Color.WHITE);
        painter.fillRect(0,0,640,480);

        painter.setFill(Color.BLACK);
        painter.fillRect(200, 100, 40, 40); //left eye
        painter.fillRect(400, 100, 40, 40); //right eye

        painter.fillRect(200, 270, 250,40); //mid mouth
        painter.fillRect(450, 230, 40, 40); //right mouth
        painter.fillRect(160, 230, 40, 40); //left eye


    }
}
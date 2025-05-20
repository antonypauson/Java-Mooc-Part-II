package drawing;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;

public class Main extends Application {

    @Override
    public void start(Stage window) {

        Canvas paintingCanvas = new Canvas(640,480);
        GraphicsContext painter = paintingCanvas.getGraphicsContext2D();

        ColorPicker colorPicker = new ColorPicker();

        BorderPane paintingLayout = new BorderPane();
        paintingLayout.setCenter(paintingCanvas);
        paintingLayout.setRight(colorPicker);

        paintingCanvas.setOnMouseDragged((event) -> {
            double xLocation = event.getX();
            double yLocation = event.getY();
            painter.setFill(colorPicker.getValue());
            painter.fillOval(xLocation, yLocation, 4, 4);
        });

        Scene scene = new Scene(paintingLayout);

        window.setScene(scene);
        window.setTitle("Main");
        window.show();
    }

    public static void main(String[] args) {
        launch(Main.class);
    }
}
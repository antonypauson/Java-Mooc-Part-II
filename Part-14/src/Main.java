import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.util.Scanner;

public class Main extends Application {

    @Override
    public void start(Stage window) {
        //axis
        NumberAxis xAxis = new NumberAxis(1968,2008,4);
        NumberAxis yAxis = new NumberAxis();

        //label
        xAxis.setLabel("Year");
        yAxis.setLabel("Relative support (%)");

        //line
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support in the years 1968-2008");

        //one full row
        XYChart.Series rkpData = new XYChart.Series();
        rkpData.setName("RKP");

        rkpData.getData().add(new XYChart.Data(1968, 5.6));
        rkpData.getData().add(new XYChart.Data(1972, 5.2));
        rkpData.getData().add(new XYChart.Data(1976, 4.7));
        rkpData.getData().add(new XYChart.Data(1980, 4.7));
        rkpData.getData().add(new XYChart.Data(1984, 5.1));
        rkpData.getData().add(new XYChart.Data(1988, 5.3));
        rkpData.getData().add(new XYChart.Data(1992, 5.0));
        rkpData.getData().add(new XYChart.Data(1996, 5.4));
        rkpData.getData().add(new XYChart.Data(2000, 5.1));
        rkpData.getData().add(new XYChart.Data(2004, 5.2));
        rkpData.getData().add(new XYChart.Data(2008, 4.7));

        lineChart.getData().add(rkpData);

        XYChart.Series vihrData = new XYChart.Series();
        vihrData.setName("VIHR");

        vihrData.getData().add(new XYChart.Data(1984, 2.8));
        vihrData.getData().add(new XYChart.Data(1988, 2.3));
        vihrData.getData().add(new XYChart.Data(1992, 6.9));
        vihrData.getData().add(new XYChart.Data(1996, 6.3));
        vihrData.getData().add(new XYChart.Data(2000, 7.7));
        vihrData.getData().add(new XYChart.Data(2004, 7.4));
        vihrData.getData().add(new XYChart.Data(2008, 8.9));


        lineChart.getData().add(vihrData);

        Scene scene = new Scene(lineChart, 640, 480);
        window.setTitle("wow");
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(Main.class);
    }
}
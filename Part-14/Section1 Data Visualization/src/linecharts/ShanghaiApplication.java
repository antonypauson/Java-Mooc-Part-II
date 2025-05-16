package linecharts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import javax.xml.crypto.Data;
import java.util.HashMap;

public class ShanghaiApplication extends Application{
    private DataFormat df;
    private HashMap<Integer, Integer> map;
    @Override
    public void init() throws Exception {
        this.df = new DataFormat();
        map = new HashMap<>();
        map = this.df.getVals();
    }

    @Override
    public void start(Stage window) throws Exception {

        NumberAxis xAxis = new NumberAxis(2006,2018,2);
        NumberAxis yAxis = new NumberAxis(0,100,10);

        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");


        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("University of Helsinki, Shanghai Ranking");

       XYChart.Series<Number, Number> series = new XYChart.Series<>();
       series.setName("Helsinki Ranking");

       map.forEach((year, rank) -> {
           series.getData().add(new XYChart.Data<>(year, rank));
       });

        lineChart.getData().add(series);


        Scene scene = new Scene(lineChart, 640, 480);
        window.setScene(scene);
        window.setTitle("Shanghai");
        window.show();
    }

    public static void main(String[] args) {

        launch(ShanghaiApplication.class);
    }
}

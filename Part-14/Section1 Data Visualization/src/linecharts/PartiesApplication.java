package linecharts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PartiesApplication extends Application {
    private PartyFormat pf;
    private HashMap<String, List<Double>> map;
    private List<Integer> years;

    @Override
    public void init() throws Exception {
        this.pf = new PartyFormat();
        map = new HashMap<>();
        map = pf.loadDataMap();
        years = new ArrayList<>();
        years = pf.loadDataYears();
    }

    @Override
    public void start(Stage window) throws Exception {

        NumberAxis xAxis = new NumberAxis(1968, 2008,4);
        NumberAxis yAxis = new NumberAxis(0,30,5);

        xAxis.setLabel("Year");
        yAxis.setLabel("Votes");

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of the parties");





        Scene scene = new Scene(lineChart,800,600);
        window.setScene(scene);
        window.setTitle("Partyz");
        window.show();
    }

    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }
}

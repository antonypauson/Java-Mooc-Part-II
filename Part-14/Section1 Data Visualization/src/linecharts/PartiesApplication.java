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

        //Line Chart layout
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of the parties");

        //map value
        for(String party : map.keySet()) {
            //for each party name in key
            //create XY series
            XYChart.Series<Number, Number> series = new XYChart.Series<>();
            series.setName(party);

            //get the double values list
            //from the map
            List<Double> values = map.get(party);

            //from each values
            //and from each year
            //create new XYChart Data

            for (int i = 0; i < values.size(); i++) {
                int year = years.get(i);
                Double value = values.get(i);
                if (value != -1) {
                    series.getData().add(new XYChart.Data<>(year, value));
                }
            }

            lineChart.getData().add(series);
        }

        Scene scene = new Scene(lineChart,800,600);
        window.setScene(scene);
        window.setTitle("Partyz");
        window.show();
    }

    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }
}

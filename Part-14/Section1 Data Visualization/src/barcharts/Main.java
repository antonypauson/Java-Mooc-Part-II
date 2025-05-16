package barcharts;

//bar chart example
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage window) throws Exception {

        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();
        BarChart<String, Number> barChart = new BarChart<>(xAxis, yAxis);

        barChart.setTitle("Populations of Nordic countries");
        barChart.setLegendVisible(true);

        XYChart.Series populations = new XYChart.Series();
        populations.getData().add(new XYChart.Data("Sweden", 10313447));
        populations.getData().add(new XYChart.Data("Denmark", 5809502));
        populations.getData().add(new XYChart.Data("Finland", 5537364));
        populations.getData().add(new XYChart.Data("Norway", 5372191));
        populations.getData().add(new XYChart.Data("Iceland", 343518));


        barChart.getData().add(populations);
        Scene scene = new Scene(barChart, 640, 480);
        window.setScene(scene);
        window.setTitle("Bar charts");
        window.show();
    }

    public static void main(String[] args) {
        launch(Main.class);
    }
}

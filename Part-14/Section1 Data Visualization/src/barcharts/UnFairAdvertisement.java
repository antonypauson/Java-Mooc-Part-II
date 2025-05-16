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

public class UnFairAdvertisement extends Application {

    @Override
    public void start(Stage window) throws Exception {

        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis(77.0, 77.5, 0.1);
        yAxis.setLabel("Faster and Better");
        BarChart<String, Number> barChart = new BarChart<>(xAxis, yAxis);

        barChart.setTitle("Internet Speed");
        barChart.setLegendVisible(false);



        XYChart.Series speeds = new XYChart.Series();
        speeds.getData().add(new XYChart.Data("NDA", 77.4));
        speeds.getData().add(new XYChart.Data("Fastie", 77.2));
        speeds.getData().add(new XYChart.Data("SuperNet", 77.1));
        speeds.getData().add(new XYChart.Data("Meganet", 77.1));




        barChart.getData().add(speeds);
        Scene scene = new Scene(barChart, 640, 480);
        window.setScene(scene);
        window.setTitle("Bar charts");
        window.show();
    }

    public static void main(String[] args) {
        launch(UnFairAdvertisement.class);
    }
}

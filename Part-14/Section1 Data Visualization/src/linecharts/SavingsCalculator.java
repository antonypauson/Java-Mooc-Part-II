package linecharts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SavingsCalculator extends Application {

    @Override
    public void start(Stage window) throws Exception {
        HBox hBox1 = new HBox(); //hbox for top elements
        Label label1 = new Label("Monthly Savings");
        Slider slider1 = new Slider(25, 250, 50); //slider
        Label slider1Label = new Label("50");         //text describing slider here
        //change value of slider label here

        slider1.valueProperty().addListener((obs, oldVal, newVal) -> {
            slider1Label.setText(String.format(String.valueOf(newVal.intValue())));
        });

        hBox1.getChildren().addAll(label1, slider1,slider1Label);

        HBox hBox2 = new HBox();
        Label label2 = new Label("Yearly interest rate");
        Slider slider2 = new Slider(0, 10, 2);
        Label slider2Label = new Label("2");         //text describing slider here

        slider2.valueProperty().addListener((obs, oldVal, newVal) -> {
            slider2Label.setText(String.format(String.valueOf(newVal.intValue())));
        });

        hBox2.getChildren().addAll(label2, slider2,slider2Label);

        VBox vBox = new VBox();
        vBox.getChildren().addAll(hBox1, hBox2);

        NumberAxis xAxis = new NumberAxis(0,30,1);
        NumberAxis yAxis = new NumberAxis(0,27500,2500);

        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Savings Calculator");
        BorderPane layout = new BorderPane();

        layout.setCenter(lineChart);
        layout.setTop(vBox);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.setTitle("Savings Calculator");
        window.show();
    }

    public static void main(String[] args) {
        launch(SavingsCalculator.class);
    }
}

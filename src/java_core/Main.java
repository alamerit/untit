package java_core;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;


import static java.lang.Math.pow;
import static java_core.FanInc.motor;


public class Main extends Application {
    private double a = 370.6954501649309;
    private double b = 0.16901736449749216;
    private double c = 0.000003918588192873316;
    private double d = -3.899612782568548e-8;
    private double q;
  //  double P=A+B*Q+C*Q**2+DQ**3





    @Override
    public void start(Stage stage) {

        initUI(stage);
    }

    private void initUI(Stage stage) {


        HBox root = new HBox();
        Scene scene = new Scene(root, 700, 500);

        Text text = new Text(motor.toString());


        NumberAxis xAxis = new NumberAxis();
        xAxis.setLabel("Расход");

        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Давление");

        LineChart lineChart = new LineChart(xAxis, yAxis);
        lineChart.setTitle("График Вентилятора");

        XYChart.Series data = new XYChart.Series();
        data.setName("2019");
        equation(data);
        lineChart.getData().add(data);

        root.getChildren().add(lineChart);

        stage.setTitle("LineChart");
        stage.setScene(scene);
        stage.show();
        root.getChildren().add(text);



    }

    private void equation(XYChart.Series data) {
        for (int i = 0; i < 3000; i=i+200) {
            q=i;
            double p=a+b*q+c*pow(q,2)+d*pow(q,3);

            data.getData().add(new XYChart.Data(q, p));

        }
    }

    public static void main(String[] args) {
        FanInc fanInc = new FanInc();
        fanInc.makeFan(0);//1 - 0
        fanInc.makeFan(1);
        launch(args);
    }



}

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class App extends Application {
    
    private TextField tfnumberToConvert = new TextField();
    private TextField tfmetricMeasurement = new TextField();
    private Button btCalculate = new Button("Calculate");
    private TextField tfresult = new TextField();

    @Override
    public void start(Stage primaryStage) {

    GridPane gridPane = new GridPane();
    gridPane.setHgap(5);
    gridPane.setVgap(5);
    gridPane.add(new Label("Number to Convert:"), 0, 0);
    gridPane.add(tfnumberToConvert, 1, 0);
    gridPane.add(new Label("Metric Measurement:"), 0, 1);
    gridPane.add(tfmetricMeasurement, 1, 1);
    gridPane.add(btCalculate, 1, 5);
    gridPane.add(tfresult, 1, 2);
    gridPane.add(new Label("Result:"), 0, 2);

    gridPane.setAlignment(Pos.CENTER);
    tfnumberToConvert.setAlignment(Pos.BOTTOM_RIGHT);
    tfmetricMeasurement.setAlignment(Pos.BOTTOM_RIGHT);
    tfresult.setAlignment(Pos.BOTTOM_RIGHT);
    tfresult.setEditable(false);
    GridPane.setHalignment(btCalculate, HPos.RIGHT);

    btCalculate.setOnAction(e -> calculateConversion());

    Scene scene = new Scene(gridPane, 400, 250);
    primaryStage.setTitle("Metric Converter");
    primaryStage.setScene(scene);
    primaryStage.show();
    
    }

    App3 app3 = new App3();

    private void calculateConversion() {
        
        float numberMeasure = Float.parseFloat(tfnumberToConvert.getText());
        String metricIdentity = tfmetricMeasurement.getText();
        String unitResult = app3.convertMeasure(numberMeasure, metricIdentity);
    
        tfresult.setText(String.valueOf(unitResult));

      }

      public static void main(String[] args) {
        launch(args);
      }
  }

  


   
    

    


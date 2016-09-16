package control;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import util.LemerAlgorithm;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Button computeButton;

    @FXML
    private BarChart chart;

    @FXML
    private TextField aField;

    @FXML
    private TextField rField;

    @FXML
    private TextField mField;

    @FXML
    private TextField nField;

    @FXML
    private Label mLabel;

    @FXML
    private Label dLabel;

    @FXML
    private Label sLabel;

    @FXML
    private Label pLabel;

    @FXML
    private Label lLabel;

    @FXML
    private Label piLabel;

    @FXML
    private Label knLabel;

    @Override
    public void initialize(URL fxmlFileLocation, ResourceBundle resources) {
        computeButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                if(aField.getText().equals("") || rField.getText().equals("") || mField.getText().equals("")) {
                    System.out.println("Bad inputs. Check again.");
                }
                else{
                    chart.getData().clear();
                    ArrayList<Integer> numbers = LemerAlgorithm.computeSequence(Double.parseDouble(aField.getText()),
                            Double.parseDouble(rField.getText()), Double.parseDouble(mField.getText()),
                            new Integer(nField.getText()));

                    XYChart.Series series = new XYChart.Series();
                    series.setName("Graph");
                    for(Integer i = 0; i < numbers.size(); i ++){
                        series.getData().add(new XYChart.Data(i.toString(), numbers.get(i)));
                    }
                    chart.getData().add(series);
                }
            }
        });

    }
}

package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javafx.event.ActionEvent;

public class Controller {


    @FXML
    private Label scoreLabel;

    @FXML
    private TextField heightFIeld;

    @FXML
    private TextField weightField;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("Kliknięto przycisk");

        double height = Integer.parseInt(heightFIeld.getText())/100.0;
        int weight = Integer.parseInt(weightField.getText());

        double score = weight/(height*height);

        scoreLabel.setText(String.format("Wskaźnik BMI to %.2f",score));



    }

}

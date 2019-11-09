package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField inputOne;

    @FXML
    private TextField inputTwo;

    @FXML
    private TextField output;

    @FXML
    private void initialize()
    {
        if (inputOne == null || inputTwo == null || output == null) {
            throw new RuntimeException("Fields not configured correctly.");
        }
        System.out.println("init complete");
    }

    @FXML
    private void calculate()
    {
        int sum = Integer.parseInt(inputOne.getText()) + Integer.parseInt(inputTwo.getText());
        output.setText(String.valueOf(sum));
    }





}

package sample;

import com.google.common.primitives.Ints;
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
    private void add()
    {
        int sum = getValueAsNumber(inputOne) + getValueAsNumber(inputTwo);
        output.setText(String.valueOf(sum));
    }

    private int getValueAsNumber(TextField inputOne) {
        Integer valueAsInt = Ints.tryParse(inputOne.getText());
        return valueAsInt == null ? 0 : valueAsInt;
    }


}

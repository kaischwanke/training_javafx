package sample;

import com.google.common.primitives.Ints;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

public class Controller {

    @FXML
    private TextField inputOne;

    @FXML
    private TextField inputTwo;

    @FXML
    private TextField output;

    @FXML
    private TextFlow intro;

    @FXML
    private TextFlow info;

    @FXML
    private void initialize()
    {
        intro.getChildren().add(new Text("Add 2 text input fields \n" +
                "(with IDs 'inputOne' and 'inputTwo'), \n" +
                "a button and another text field (ID 'output',read-only)\n" +
                "The button should call the action with ID 'add"));
        if (inputOne == null || inputTwo == null || output == null) {
            Text error = new Text("Fields not configured correctly");
            info.getChildren().add(error);
            error.setFill(Color.RED);
            //throw new RuntimeException("Fields not configured correctly.");
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

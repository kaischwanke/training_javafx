package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResources("sample.fxml").nextElement());
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(new Scene(root, 450, 375));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

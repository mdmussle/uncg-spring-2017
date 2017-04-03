package bofforegister;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

   @Override
    public void start(Stage primaryStage) {
        // Create a BoffoRegisterGUI object.
        BoffoRegister register = new BoffoRegister(primaryStage);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        // Initialize the Transaction object.
    }

}

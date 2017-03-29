package bofforegister;

import gui.BoffoRegisterGUI;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

   @Override
    public void start(Stage primaryStage) {
        // Create a BoffoRegisterGUI object.
        BoffoRegisterGUI register = new BoffoRegisterGUI(primaryStage);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        // Initialize the Transaction object.
    }

}

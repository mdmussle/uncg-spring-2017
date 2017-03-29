/*
 * Boffo Register GUI (Unfinished and without event handling)
 * Considering moving each panel to a separate class for readability.
 */
package gui;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
 * @author Logan Stanfield and Kevin Keomalaythong
 * @version 0.1
 */
public final class BoffoRegisterGUI {

    private final Stage primaryStage;

    public BoffoRegisterGUI(Stage _primaryStage) {
        this.primaryStage = _primaryStage;
        this.loadLoginPanel();
    }
    
    /*
     * TODO: Stubbed in method for loading Admin panel.
     */
    public void loadAdminPanel() {
        //MARK: Add logic here
    }
    
    /*
     * TODO: Stubbed in method for loading Inventory panel.
     */
    public void loadInventoryPanel() {
        //MARK: Add logic here
    }
    
    /*
     * Loads the login panel.
     */
    public void loadLoginPanel() {
        System.out.println("Loading Login Panel");
        primaryStage.setTitle("BoffoRegister Login");
        Scene loginScene = this.buildLoginScene();
        primaryStage.setScene(loginScene);           //Sets up the primary stage.
        this.primaryStage.show();                    //Shows primary stage.
    }

    /*
     * Loads the main panel.
     */
    public void loadMainPanel() {
        System.out.println("Loading Main Panel");
        primaryStage.setTitle("Boffo Register Main Menu");
        Scene mainScene = this.buildMainPanel();
        primaryStage.setScene(mainScene);            //Sets up the primary stage
        this.primaryStage.show();                    //Displays main panel
    }

    /*
     * Loads Transaction panel.
     */
    public void loadTransactionPanel() {
        System.out.println("Loading Transaction Panel");
        primaryStage.setTitle("Transaction");
        Scene transScene = buildTransactionPanel();
        primaryStage.setScene(transScene);          //Sets up the the primary stage
        primaryStage.show();                        //Displays transtaction panel
    }

    //TODO: Stubbed in method for building the admin scene.
    public void /*Scene*/ buildAdminPanel() {
        //MARK: Add logic here
    }

    /*
     * This method helps build the login in panel. Creates a TextField, a
     * PaswordField, and a sign-in button.
     */
    public Scene buildLoginScene() {
        GridPane grid = new GridPane();             //Creates new GridPane object
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        Scene scene = new Scene(grid, 325, 275);   //Sets size of grid to 325x275.

        //Adds a title with specified font and text.
        Text sceneTitle = new Text("Welcome to BoffoRegister");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(sceneTitle, 0, 0, 2, 1);

        Label userName = new Label("User Name:");       //Creates new label object.
        grid.add(userName, 0, 1);       //Places label on scene.

        TextField userTextField = new TextField();      //Creates a new textfield object.
        grid.add(userTextField, 1, 1);

        Label pw = new Label("Password:");              //Creates new label object.
        grid.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField();      //Creates a new password field.
        grid.add(pwBox, 1, 2);                          //Adds password field to grid.

        Button btn = new Button("Sign In");             //Creates a button object.
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add((btn));
        grid.add(hbBtn, 1, 4);                          //Adds button to grid.

        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);

        /*
         * This block is executed when the exit is pressed and loads the main panel.
         * TODO: Implement event handling.
         */
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                //TODO: Fix to check if user credentials are valid.
                if(isValidUser()){
                    loadMainPanel();        //If user is valid then load main panel.
                }     
            }
        });

        return scene;                       //Returns scene when complete.
    }

    //TODO: Stubbed in method for building the transaction scene.
    public void /*Scene*/ buildInventoryPanel() {

    }
    /*
     * TODO: Add more menu options to menu panel
     * This method helps build the main panel
     */
    public Scene buildMainPanel() {
        Button btnTransaction = new Button();
        btnTransaction.setText("Transaction");
        VBox vbox = this.addVBox("Select Operation");
        vbox.getChildren().add(btnTransaction);
        // Create the scene with size 800x600.
        Scene scene = new Scene(vbox, 800, 600);
        
        /* 
         * This block is executed when Transaction button is pressed on main panel.
         * TODO: Implement event handling.
         */
        btnTransaction.setOnAction(new EventHandler<ActionEvent>() {
           
            @Override
            public void handle(ActionEvent e) {
                loadTransactionPanel();         //Loads transaction panel when trans button is pressed.
            }
                    
        });
        
        return scene;           //Return created scene.
    }

    /*
     * TODO: Display ticket items in a TableView or list.
     * This method helps build the transaction panel. Creates several buttons
     *    including an exit button to return to main panel.
     */
    public Scene buildTransactionPanel() {
        
        Button addItem1Btn = new Button();
        addItem1Btn.setText("Add item 1");
        
        Button addItem2Btn = new Button();
        addItem2Btn.setText("Add item 2");
        
        Button exitBtn = new Button();
        exitBtn.setText("Exit");
        
        VBox vbox = this.addVBox("Select Operation");
        vbox.getChildren().add(addItem1Btn);
        vbox.getChildren().add(addItem2Btn);
        vbox.getChildren().add(exitBtn);
        
        Scene transScene = new Scene(vbox, 800, 600);
        
        /*
         * 
         */
        exitBtn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e) {
                loadMainPanel();
            }
        });
        
        return transScene;
    }

    /*
     * Creates a vertical box with a header.
     */
    private VBox addVBox(String header) {
        VBox vbox = new VBox();
        vbox.setPadding(new Insets(10));
        vbox.setSpacing(8);
        // Menu Title
        Text title = new Text(header);
        title.setFont(Font.font("Tahoma", FontWeight.BOLD, 14));
        vbox.getChildren().add(title);
        return vbox;
    }
    /*
     * TODO: Stubbed in method to check if entered credentials are valid
    */
    private boolean isValidUser() {
        //MARK: Add user check logic here.
        return true;
    }
    
    //TODO: Display ticket on transaction panel in TableView or List
    private void displayTicket(/*Ticket ticket*/) {
        
    }
}
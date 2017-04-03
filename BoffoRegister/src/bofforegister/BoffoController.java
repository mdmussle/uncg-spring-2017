package bofforegister;

import events.BoffoEvent;
import gui.BoffoRegisterGUI;
import javafx.stage.Stage;
import events.BoffoListenerInterface;
import events.BoffoMessenger;

import transaction.Transaction;

/**
 *
 * @author joshuabr7 & joshlmilligan
 */
public class BoffoController implements BoffoListenerInterface{

    //Add references to required modules

    protected BoffoRegisterGUI gui;
    protected Transaction transaction;

    BoffoController(Stage primaryStage) {
        this.gui = new BoffoRegisterGUI(primaryStage);
    }

    /*
     * Will include each panel to be loaded by the GUI
     * and add listeners.
     * The mainPanel will remove the active listener each time it
     * is called.
     */
    private void mainPanel() {
        this.gui.loadMainPanel();
    }

    private void transactionPanel() {
        this.gui.loadTransactionPanel();
    }

    private void inventoryPanel() {

    }

    private void loginPanel() {

    }

    private void registerPanelListener() {

    }

    @Override
    public void messageRecieved(BoffoEvent event) {
        switch (event.getMessage().getCode()) {
            case BoffoMessenger.TRANSACTION_PANEL:
                System.out.println("Boffo Controller responding to Transaction Panel Event...");
                this.transactionPanel();
                break;
            case BoffoMessenger.EXIT_PANEL:
                System.out.println("Boffo Controller responding to Main Menu Panel Event...");
                this.mainPanel();
                break;
            default:
                System.out.println("Ignoring message because it is irrelevant to the Controller. "
                                        + "\nPassing along the following event message "
                                        + event.getMessage().getCode());
        }
    }
}

package bofforegister;

import gui.BoffoRegisterGUI;
import javafx.stage.Stage;
import events.BoffoEvent;

import transaction.Transaction;

/**
 *
 * @author joshuabr7 & joshlmilligan
 */
public class BoffoController {

    //Add references to required modules

    // LoginModule : BoffoModule

    // AdministrationModule : BoffoModule

    // UserModule : BoffoModule

    // InventoryModule : BoffoModule

    // Printer

    protected BoffoRegisterGUI gui;
    protected BoffoRegisterGUI gui;
    protected Transaction transaction;
//    protected BoffoRegisterModule activemodule = null;

    BoffoController(Stage primaryStage) {
        this.gui = new BoffoRegisterGUI(primaryStage);
//        this.gui.addBRegisterListener(this);
    }

    /*
     * Will include each panel to be loaded by the GUI
     * and add listeners.
     * The mainPanel will remove the active listener each time it
     * is called.
     */
    private void mainPanel() {
        this.gui.loadMainPanel();
//        this.gui.removeBRegisterListener(this.activeModule);
//        this.activeModule = null;
    }

    private void transactionPanel() {

    }

    private void inventoryPanel() {

    }

    public void changePanel(int event) {
        switch(event) {
//            case LOGIN_PANEL:        // Change to the Login Panel.
//
//                break;
//
//            case MAIN_PANEL:        // Change to the Main Panel.
//                mainPanel();
//                break;
//
//            case ADMIN_PANEL:       // Change to the Admin Panel.
//
//                break;
//
//            case INVENTORY_PANEL:   // Change to the Inventory Panel.
//
//                break;
//
//            case TRANSACTION_PANEL: // Change to the Transaction Panel
//
//                break;

            default:
                // If its not a panel change event, ignore it.
                break;
        }
    }
    }

//    private void registerPanelListener(BoffoRegisterModule newModule) {
//        this.activemodule = newModule;
//        this.gui.addBRegisterListener;
//    }
}

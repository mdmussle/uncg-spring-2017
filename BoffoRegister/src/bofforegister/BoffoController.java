/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bofforegister;

//import (some modules)
import gui.BoffoRegisterGUI;
import javafx.stage.Stage;
//import boffoevents.RegisterEvent;
//import boffoevents.RegisterMessage;

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
//    private void registerPanelListener(BoffoRegisterModule newModule) {
//        this.activemodule = newModule;
//        this.gui.addBRegisterListener;
//    }

//    @Override
//    public void messageReceived(RegisterEvent event) {
//        // We're only interested in 3 particular events.
//        switch (event.getMessage().getCode()){
//            case RegisterMessage.TRANSACTION_PANEL:
//                System.out.println("Controller Responding to Transaction Panel Event.");
//                this.transactionPanel();
//                break;
//            case RegisterMessage.INVENTORY_PANEL:
//                System.out.println("Controller Responding to Inventory Panel Event.");
//                this.inventoryPanel();
//                break;
//            case RegisterMessage.EXIT_PANEL:
//                System.out.println("Controller Responding to Main Menu Panel Event.");
//                this.mainPanel();
//                break;
//            default:
//                System.out.println("Ignoring Message Code as Irrelevant to Controller. " + event.getMessage().getCode());
//                break;
//        }
//    }
}

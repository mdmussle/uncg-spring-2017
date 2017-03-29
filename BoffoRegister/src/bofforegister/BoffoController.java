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
    
    protected BoffoRegisterGUI gui;
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

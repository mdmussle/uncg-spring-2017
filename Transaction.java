/**
 * Transaction Object
 */
package modules;

import bofforegisterevents.RegisterEvent;
import bofforegisterevents.RegisterMessage;

public class Transaction {
    public Transaction(){
           System.out.println("Transaction Module Loaded");
    }
    
    /**
     * gets called when an item has been added to the ticket
    */
    public void addItem(){
        //an item has been added to the ticker
        System.out.println("Item has been added to ticket.");
    }
    
    /**
     * gets called when an item is removed from the ticket
     */
    public void removeItem(){
        System.out.println("Item has been removed from ticket.");
    }
    
    /**
     * sends event to listener and awaits response
     * @param event 
     */
    public void messageReceived(RegisterEvent event){
        switch(event.getMessage().getCode()){
            case RegisterMessage.addProduct:
                this.addItem();
                break;
            case RegisterMessage.removeProduct:
                this.removeItem();
                break;
            default: 
                System.out.println("Ignoring Message Event. "
                  + "Irrelevant to Transaction" + event.getMessage().getCode());
                break;
        }
    }
    
    
}
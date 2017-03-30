package events;

//Maclean Frazier

import java.util.EventObject;

public class BoffoEvent extends EventObject {

    private final BoffoMessenger message;

    public BoffoEvent(Object source, int messageString) {
        super(source);
        this.message = new BoffoMessenger(messageString);
    }

    public BoffoMessenger getMessage() {
        return message;
    }

}

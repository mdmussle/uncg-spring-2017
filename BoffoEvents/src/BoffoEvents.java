//Maclean Frazier

import java.util.EventObject;

public class BoffoEvents extends EventObject {
    
    private final BoffoMessenger message;
    
    public BoffoEvents(Object source, BoffoMessenger message) {
        super(source);
        this.message = message;
    }
    
    public BoffoMessenger getMessage() {
        return message;
    }
    
}

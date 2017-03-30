//Maclean Frazier

public class BoffoMessenger {

    public static final int EXIT_PANEL = 1;
    public static final int TRANSACTION_PANEL = 2;
    public static final int ADD_TRANSACTION = 3;
    private final int THIS_MESSAGE;
       
    public BoffoMessenger(int message) {
        this.THIS_MESSAGE = message; 
    }
    
    public int getCode() {
        return this.THIS_MESSAGE;
    }

}
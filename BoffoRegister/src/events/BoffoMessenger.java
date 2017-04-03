package events;

//Maclean Frazier

public class BoffoMessenger {
    private final int THIS_MESSAGE;
    public BoffoMessenger(int message) {
        this.THIS_MESSAGE = message;
    }

    public int getCode() {
        return this.THIS_MESSAGE;
    }

}
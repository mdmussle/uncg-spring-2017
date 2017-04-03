package database;

public class BoffoDatbaseAPI {

    private final String dbUrl = "jdbc://localhost:3306/SCHEMANAME";
    private ConnectionManager dbConnection;

    public BoffoDatbaseAPI() {
        dbConnection = new ConnectionManager();
    }

    public void dbLogin(String uName, String uPass) {
        dbConnection.connectToDB(dbUrl, "admin", "password");
    }

    public void dbLogout(){
        dbConnection.closeConnection();
    }

    public void createDbEntry(){

    }

    public void updateDbEntry(){

    }

    public void removeDbEntry(){

    }

    public void deleteDbEntry(){

    }
}

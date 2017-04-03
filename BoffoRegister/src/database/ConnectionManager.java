package database;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class ConnectionManager {

    private Connection dbConnection;

    public ConnectionManager() {

    }

    public void connectToDB(String url, String uName, String uPass) {
        try {
            dbConnection = DriverManager.getConnection(url, uName, uPass);
            System.out.println("Connection Successful.");
        } catch(SQLException e) {
            System.out.print("Something went wrong trying to connect. "+e);
        }
    }

    public void closeConnection() {
        try {
            dbConnection.close();
            System.out.println("Connection closed.");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public Connection getConnection() {
        return dbConnection;
    }
}

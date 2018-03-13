package Erik_Niels;

/**
 * @author Niels on 13-03-2018.
 */
import java.sql.*;
import java.sql.*;

public class DB_Connector {

    //  Database url
    private static String url = "jdbc:postgresql://localhost:5432/postgres";
    //  Username
    private static String user = "postgres";
    //  Password
    private static String pass = "12345";
    //  Declare a Connection
    private static Connection conn = null;

    //    Method that creates & opens a connection to postgresql db
    public static Connection connect() {

        System.out.println("\n--Connecting to MyServer JDBC--");

        try {

            //  Check connection credentials
            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("\n--JDBC driver registered--");

        }
        //  Handle possible exceptions
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error : " + e);

        }
        //  Check if there is a connection
        if (conn != null) {
            System.out.println("\n--Connection successful--");
            System.out.println("\n--You are logged in as " + user + "--");
            System.out.println("\n--Logged into: postgres--");
        } else {
            System.out.println("\n--Connection failed--");
        }

        return conn;
    }

    //  Method that closes the connection if exists
    public void closeConnection() {

        try {

        }
        finally {
            try {
                System.out.println("\n--Closing connection to database--");
                if (conn != null) {
                    conn.close();
                    System.out.println("\n--Connection closed--");

                }
            }
            catch(SQLException e) {
                e.printStackTrace();
                System.out.println("\n--Error - closing connection failed--");
            }
        }
    }

}
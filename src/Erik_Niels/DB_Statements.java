package Erik_Niels;

/**
 * @author Niels on 13-03-2018.
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.io.*;
import java.sql.*;

public class DB_Statements {

    //    Declare a Statement
    private static Statement stmt = null;
    //    Declare a result set
    private static ResultSet rs = null;
    //    Declare a PreparedStatement
    private static PreparedStatement pst = null;
    //    Declare & create a connection
    private static Connection con = DB_Connector.connect();


//    public void insertData() {

/*        Employee emp = new Employee(53, "Ben", 1200.54);
        String query = "insert into employee (emp) values(?)";


        try {
            //  Take an Employee object and convert it to a Byte array
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(emp);
            byte[] employeeAsByte = baos.toByteArray();

            //  Create a PreparedStatement
            pst = con.prepareStatement(query);

            //  Place the converted object into the input stream
            ByteArrayInputStream bais = new ByteArrayInputStream(employeeAsByte);
            pst.setBinaryStream(1, bais, employeeAsByte.length);

            //  Execute the query
            pst.executeUpdate();
            System.out.println("\n--Query1 executed--");

        }
        //  Handle all possible exceptions
        catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("\n--Query1 did not execute--");
        }



    }

        public void retrieveData () {

            String query = "SELECT * FROM employee";

            try {
                //  Create a Statement
                stmt = con.createStatement();

                //  Execute the ResultSet
                rs = stmt.executeQuery(query);

                //  Return all rows from the table
                while (rs.next()) {
                    byte[] st = (byte[]) rs.getObject(2);
                    ByteArrayInputStream baip = new ByteArrayInputStream(st);
                    ObjectInputStream ois = new ObjectInputStream(baip);
                    Employee emp = (Employee) ois.readObject();
                    System.out.println("\n" + emp.toString());

                }

                System.out.println("\n--Retrieve executed--");
            }
            //  Handle all possible exceptions
            catch (Exception e) {
                e.printStackTrace();
                System.out.println("\n--Retrieve did not execute--");
            }
        }*/
//    }

    public static double getA() {

        // Statement til databasen
        String query = "SELECT a FROM public.pant_price";

        // Deklaration af double datatype til a
        double a = 0;

        try {
            //  Create a Statement
            stmt = con.createStatement();

            //  Execute the ResultSet
            rs = stmt.executeQuery(query);

            //  Return A column from the table
            while (rs.next()) {
                a = rs.getDouble(1);
            }
            System.out.println("\n--Retrieve executed--");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("\n--Retrieve did not execute--");
        }

        return a;
    }
}
package Erik_Niels;

/**
 * @author Niels on 13-03-2018.
 */
import javafx.scene.control.TextField;

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

    public static double getB() {

        // Statement til databasen
        String query = "SELECT b FROM public.pant_price";

        // Deklaration af double datatype til b
        double b = 0;

        try {
            //  Create a Statement
            stmt = con.createStatement();

            //  Execute the ResultSet
            rs = stmt.executeQuery(query);

            //  Return A column from the table
            while (rs.next()) {
                b = rs.getDouble(1);
            }
            System.out.println("\n--Retrieve executed--");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("\n--Retrieve did not execute--");
        }

        return b;
    }

    public static double getC() {

        // Statement til databasen
        String query = "SELECT c FROM public.pant_price";

        // Deklaration af double datatype til b
        double c = 0;

        try {
            //  Create a Statement
            stmt = con.createStatement();

            //  Execute the ResultSet
            rs = stmt.executeQuery(query);

            //  Return A column from the table
            while (rs.next()) {
                c = rs.getDouble(1);
            }
            System.out.println("\n--Retrieve executed--");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("\n--Retrieve did not execute--");
        }

        return c;
    }

    public static void insertTransaction(TextField totala, TextField totalb, TextField totalc, TextField totalitems, TextField total_refund) {

        Integer totalatoInt = Integer.valueOf(totala.getText());
        Integer totalbtoInt = Integer.valueOf(totalb.getText());
        Integer totalctoInt = Integer.valueOf(totalc.getText());
        Integer totalitemstoInt = Integer.valueOf(totalitems.getText());
        Double total_refundtoDouble = Double.valueOf(total_refund.getText());

        String query = "INSERT INTO public.transaction( a, b, c, total_num_items, total_refund) VALUES (" + totalatoInt + "," + totalbtoInt + "," + totalctoInt + "," + totalitemstoInt + "," + total_refundtoDouble + ")";

        try {
            //  Create a Statement
            stmt = con.createStatement();

            stmt.executeUpdate(query);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("\n--Insert did not execute--");
        }
    }
}
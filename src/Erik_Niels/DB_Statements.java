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

public class DB_Statements {}
/*
    //    Declare a Statement
    private static Statement stmt = null;
    //    Declare a result set
    private static ResultSet rs = null;
    //    Declare a PreparedStatement
    private static PreparedStatement pst = null;
    //    Declare & create a connection
    private static Connection con = DB_Connector.connect();


    @SuppressWarnings("JpaQueryApiInspection")
    public void insertData() {

        //Retur aRetur = new Retur(0, 1, 2, 3);
        //String query = "insert into pant_price (a, b, c) values(1, 1.5, 3)";


        try {
            //  Take an Retur object and convert it to a Byte array
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(aRetur);
            byte[] returAsByte = baos.toByteArray();

            //  Create a PreparedStatement
            pst = con.prepareStatement(query);

            //  Place the converted object into the input stream
            ByteArrayInputStream bais = new ByteArrayInputStream(returAsByte);
            pst.setBinaryStream(1, bais, returAsByte.length);

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

            String query = "SELECT * FROM transactions";

            try {
                //  Create a Statement
                stmt = con.createStatement();

                //  Execute the ResultSet
                rs = stmt.executeQuery(query);

                //  Retur all rows from the table
                while (rs.next()) {
                    byte[] st = (byte[]) rs.getObject(2);
                    ByteArrayInputStream baip = new ByteArrayInputStream(st);
                    ObjectInputStream ois = new ObjectInputStream(baip);
                    Retur emp = (Retur) ois.readObject();
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


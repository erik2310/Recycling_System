package Erik_Niels;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.lang.reflect.Type;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("GUI.fxml"));
        primaryStage.setTitle("Retur Pant");
        primaryStage.setScene(new Scene(root, 300, 400));
        primaryStage.show();
    }

    public static ArrayList<Return> collectedReturns = new ArrayList<Return>();

    public static void insertbottle(Container c){
        collectedReturns.add(new Return(0.,1.,"bottle","plastic",4.0,"A"));
    }

    public static double getTotalRefund(){
        double totalSum = 0.0;
        for (Return r : collectedReturns) {
            totalSum += r.getValue();
        }
        return totalSum;
    }

    public static Map getTypeOverview(){
        Map<String, Integer> types = new HashMap<String, Integer>();
        for (Return r : collectedReturns) {
            String cat = r.getName();
            if(types.containsKey(cat)){
                types.put(cat,types.get(cat)+1);
            }
            else{
                types.put(cat,1);
            }
        }
        return types;
    }

    public static void main(String[] args) {

        ArrayList<Container> bag = new ArrayList<Container>();
        bag.add(new Container(0.75,"bottle","plastic"));
        bag.add(new Container(0.75,"bottle","plastic"));
        bag.add(new Container(0.75,"bottle","plastic"));
        bag.add(new Container(0.33,"can","aluminium"));
        bag.add(new Container(0.5,"bottle","plastic"));

        for (Container c : bag) {
            insertbottle(c);
        }

        Map<String,Integer> categories = getTypeOverview();
        for (Object cat : categories.keySet()) {
            System.out.println(cat.toString() + " : " + categories.get(cat));
        }

        System.out.println("Total monetary refund: " + getTotalRefund());
        //System.out.println("Category: " + c.getType() + " for up to " + c.getSize() + "L" + " made of " + c.getMaterial());
    }




    /*
        //  Retur DB_Connector
        Connection conn = DB_Connector.connect();

            //  Create a DB_Connector object
        DB_Connector connect = new DB_Connector();

            //  Retur DB_Statements - insertData and retrieveData methods
            DB_Statements statements = new DB_Statements();
            statements.insertData();
            statements.retrieveData();



//        launch(args); {
            } */

}



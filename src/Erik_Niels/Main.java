package Erik_Niels;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.Connection;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("GUI.fxml"));
        primaryStage.setTitle("Recycling System");
        primaryStage.setScene(new Scene(root, 300, 400));
        primaryStage.show();
    }


    public static void main(String[] args) {

            //  Test DB_Connector
//        Connection conn = DB_Connector.connect();

            //  Create a DB_Connector object
//        DB_Connector connect = new DB_Connector();

            //  Test DB_Statements - insertData and retrieveData methods
//            DB_Statements statements = new DB_Statements();
 //           statements.insertData();
//            statements.retrieveData();

        launch(args);

        }
    }

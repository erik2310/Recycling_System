package Erik_Niels.View;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("GUI.fxml"));
        primaryStage.setTitle("Retur Pant");
        primaryStage.setScene(new Scene(root, 350, 400));
        primaryStage.show();
    }

   /* public static ArrayList<Return> collectedReturns = new ArrayList<Return>();

    public static void insertbottle(Container c) {
        collectedReturns.add(new Return(0., 1., "bottle", "plastic", 1.5, "A"));
    }

    public static double getTotalRefund() {
        double totalSum = 0.0;
        for (Return r : collectedReturns) {
            totalSum += r.getValue();
        }
        return totalSum;
    }

    public static Map getTypeOverview() {
        Map<String, Integer> types = new HashMap<String, Integer>();
        for (Return r : collectedReturns) {
            String cat = r.getName();
            if (types.containsKey(cat)) {
                types.put(cat, types.get(cat) + 1);
            } else {
                types.put(cat, 1);
            }
        }
        return types;
    }
*/
    public static void main(String[] args) {

 /*       ArrayList<Container> bag = new ArrayList<Container>();
        bag.add(new Container(0.75, "bottle", "plastic"));
        bag.add(new Container(0.75, "bottle", "plastic"));
        bag.add(new Container(0.75, "bottle", "plastic"));
        bag.add(new Container(0.33, "can", "aluminium"));
        bag.add(new Container(0.5, "bottle", "plastic"));

        for (Container c : bag) {
            insertbottle(c);
        }

        Map<String, Integer> categories = getTypeOverview();
        for (Object cat : categories.keySet()) {
            System.out.println(cat.toString() + " : " + categories.get(cat));
        }

        System.out.println("Total monetary refund: " + getTotalRefund());
        //System.out.println("Category: " + c.getType() + " for up to " + c.getSize() + "L" + " made of " + c.getMaterial());

*/
        launch(args);
    }
}

package Erik_Niels;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    // Deklaration af FXML variabler
    @FXML
    private Button typeAButton;
    @FXML
    private Button typeBButton;
    @FXML
    private Button typeCButton;
    @FXML
    private Button kvitteringButton;
    @FXML
    private TextField typeATotal;
    @FXML
    private TextField typeBTotal;
    @FXML
    private TextField typeCTotal;
    @FXML
    private TextField total;
    @FXML
    private TextField totalKr;
    @FXML
    private TextField typeAKr;
    @FXML
    private TextField typeBKr;
    @FXML
    private TextField typeCKr;


    // Metoderne til knapperne
    @FXML
    protected void typeAButtonAction() {
        // Hvis typeATotal er tom så set teksten til 0
        if (typeATotal.getText().equals("")) {
            typeATotal.setText("0");
        }

        Integer totalNumToInt = Integer.valueOf(typeATotal.getText());
        totalNumToInt++;
        String totalNumToSting = String.valueOf(totalNumToInt);
        typeATotal.setText(totalNumToSting);
    }

    @FXML
    protected void typeBButtonAction() {
        System.out.println("Hello world!");
    }

    @FXML
    protected void typeCButtonAction() {
        System.out.println("Hello world!");
    }

    @FXML
    protected void kvitteringButtonAction() {
        System.out.println("Hello world!");
    }

}

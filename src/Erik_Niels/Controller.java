package Erik_Niels;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
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
    @FXML
    private TextArea KtTextArea;


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
        // Metoderne til knapperne
        @FXML
        protected void typeBButtonAction() {
            // Hvis typeBTotal er tom så set teksten til 0
            if (typeBTotal.getText().equals("")) {
                typeBTotal.setText("0");
            }

            Integer totalNumToInt = Integer.valueOf(typeBTotal.getText());
            totalNumToInt++;
            String totalNumToSting = String.valueOf(totalNumToInt);
            typeBTotal.setText(totalNumToSting);
    }
    // Metoderne til knapperne
    @FXML
    protected void typeCButtonAction() {
        // Hvis typeCTotal er tom så set teksten til 0
        if (typeCTotal.getText().equals("")) {
            typeCTotal.setText("0");
        }

        Integer totalNumToInt = Integer.valueOf(typeCTotal.getText());
        totalNumToInt++;
        String totalNumToSting = String.valueOf(totalNumToInt);
        typeCTotal.setText(totalNumToSting);
    }
/*
    @FXML
    protected void typeBButtonAction() {
        System.out.println("Hello, B Button here!");
    }

    @FXML
    protected void typeCButtonAction() {
        System.out.println("Hello, C Button here!");
    }
*/
    @FXML
    protected void kvitteringButtonAction() {
        //Det her skal fjernes igen, et forsøg der skulle vise at vi kan printe til TextArea
        String svarTekst = "*******Hello, Kvitterings Button here!*******";
        KtTextArea.appendText(svarTekst + "\n");
   //     System.out.println("Hello, Kvitterings Button here!");
    }

}

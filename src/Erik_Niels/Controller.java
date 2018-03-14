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

        // Lægger 1 til typeATotal
        typeATotal.setText(Calculate.addOne(typeATotal));

        // Lægger 1 til total
        total.setText(Calculate.addOne(total));

        // Lægger værdien for a fra databasen til typeAKr
        typeAKr.setText(Calculate.addA(typeAKr));

        // Lægger værdien for a fra databasen til totalKr
        totalKr.setText(Calculate.addA(totalKr));
    }

    @FXML
    protected void typeBButtonAction() {

        // Lægger 1 til typeBTotal
        typeBTotal.setText(Calculate.addOne(typeBTotal));

        // Lægger 1 til total
        total.setText(Calculate.addOne(total));

        // Lægger værdien for b fra databasen til typeBKr
        typeBKr.setText(Calculate.addB(typeBKr));

        // Lægger værdien for b fra databasen til totalKr
        totalKr.setText(Calculate.addB(totalKr));
    }

    @FXML
    protected void typeCButtonAction() {

        // Lægger 1 til typeCTotal
        typeCTotal.setText(Calculate.addOne(typeCTotal));

        // Lægger 1 til total
        total.setText(Calculate.addOne(total));

        // Lægger værdien for c fra databasen til typeCKr
        typeCKr.setText(Calculate.addC(typeCKr));

        // Lægger værdien for c fra databasen til totalKr
        totalKr.setText(Calculate.addC(totalKr));
    }

    @FXML
    protected void kvitteringButtonAction() {
        //Det her skal fjernes igen, et forsøg der skulle vise at vi kan printe til TextArea
        String svarTekst = "*******Hello, Kvitterings Button here!*******";
        KtTextArea.appendText(svarTekst + "\n");
   //     System.out.println("Hello, Kvitterings Button here!");
    }

}

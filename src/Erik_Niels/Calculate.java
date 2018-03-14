package Erik_Niels;

import javafx.scene.control.TextField;

public class Calculate {

    // Metode til at lægge 1 til et TextField
    public static String addOne(TextField typeTotal) {

        // Hvis typeTotal er tom så sættes teksten til 0
        if (typeTotal.getText().equals("")) {
            typeTotal.setText("0");
        }

        // Henter typeTotal værdi og converter den til Integer
        Integer totalNumToInt = Integer.valueOf(typeTotal.getText());

        // Lægger 1 til den
        totalNumToInt++;

        // Converter den tilbage til String
        String totalNumToSting = String.valueOf(totalNumToInt);

        return totalNumToSting;
    }

}

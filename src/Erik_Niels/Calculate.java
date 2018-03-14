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

    // Metode til at lægge a's værdi fra databasen til et TextField
    public static String addA(TextField typeKr) {

        // Hvis typeTotal er tom så sættes teksten til 0
        if (typeKr.getText().equals("")) {
            typeKr.setText("0");
        }

        // Henter typeKr værdi og converter den til Double
        Double totalKrToDouble = Double.valueOf(typeKr.getText());

        // Lægger værdien fra databasen for a til den
        totalKrToDouble = totalKrToDouble + DB_Statements.getA();

        // Converter den tilbage til String
        String totalNumToSting = String.valueOf(totalKrToDouble);

        return totalNumToSting;
    }

}

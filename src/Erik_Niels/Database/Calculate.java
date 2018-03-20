package Erik_Niels.Database;

import javafx.scene.control.TextField;

import java.math.BigDecimal;

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

        // Hvis typeKr er tom så sættes teksten til 0
        if (typeKr.getText().equals("")) {
            typeKr.setText("0");
        }

        // Henter typeKr værdi og converter den til Double
        Double totalKrToDouble = Double.valueOf(typeKr.getText());

        // Lægger værdien fra databasen for a til den
        totalKrToDouble = totalKrToDouble + DB_Statements.getA();

        // Laver værdien om til et tal med 2 decimaler
        BigDecimal totalKrToBigDecimal = BigDecimal.valueOf(totalKrToDouble).setScale(2);

        // Converter den tilbage til String
        String totalNumToSting = String.valueOf(totalKrToBigDecimal);

        return totalNumToSting;
    }

    // Metode til at lægge b's værdi fra databasen til et TextField
    public static String addB(TextField typeKr) {

        // Hvis typeKr er tom så sættes teksten til 0
        if (typeKr.getText().equals("")) {
            typeKr.setText("0");
        }

        // Henter typeKr værdi og converter den til Double
        Double totalKrToDouble = Double.valueOf(typeKr.getText());

        // Lægger værdien fra databasen for b til den
        totalKrToDouble = totalKrToDouble + DB_Statements.getB();

        // Laver værdien om til et tal med 2 decimaler
        BigDecimal totalKrToBigDecimal = BigDecimal.valueOf(totalKrToDouble).setScale(2);

        // Converter den tilbage til String
        String totalNumToSting = String.valueOf(totalKrToBigDecimal);

        return totalNumToSting;
    }

    // Metode til at lægge c's værdi fra databasen til et TextField
    public static String addC(TextField typeKr) {

        // Hvis typeKr er tom så sættes teksten til 0
        if (typeKr.getText().equals("")) {
            typeKr.setText("0");
        }

        // Henter typeKr værdi og converter den til Double
        Double totalKrToDouble = Double.valueOf(typeKr.getText());

        // Lægger værdien fra databasen for c til den
        totalKrToDouble = totalKrToDouble + DB_Statements.getC();

        // Laver værdien om til et tal med 2 decimaler
        BigDecimal totalKrToBigDecimal = BigDecimal.valueOf(totalKrToDouble).setScale(2);

        // Converter den tilbage til String
        String totalNumToSting = String.valueOf(totalKrToBigDecimal);

        return totalNumToSting;
    }

}

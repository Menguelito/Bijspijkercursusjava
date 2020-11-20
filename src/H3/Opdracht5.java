package H3;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Opdracht5 {

    private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    private static DecimalFormatSymbols dfs = new DecimalFormatSymbols();

    private static double gewicht;
    private static double lengte;
    private static double bmi;

    public static void main(String[] args) {

        dfs.setDecimalSeparator('.');
        df2.setDecimalFormatSymbols(dfs);

        System.out.println("Wat is uw gewicht (kg)? ");
        gewicht = sc.nextDouble();
        System.out.println("Wat is uw lengte (m)? ");
        lengte = sc.nextDouble();

        bmi = (gewicht / Math.pow(lengte, 2));
        bmi = Double.parseDouble(df2.format(bmi));
        System.out.println("Uw BMI is " + bmi);

        if (bmi < 18.5) {
            System.out.println("Als u minstens 20 jaar bent betekent dit dat u " + "ondergewicht" + " hebt.");
        } else if (18.5 <= bmi && bmi < 25.0) {
            System.out.println("Als u minstens 20 jaar bent betekent dit dat u " + "normaal" + " hebt.");
        } else if (25.0 <= bmi && bmi < 30.0) {
            System.out.println("Als u minstens 20 jaar bent betekent dit dat u " + "overgewicht" + " hebt.");
        } else if (30.0 <= bmi) {
            System.out.println("Als u minstens 20 jaar bent betekent dit dat u " + "zwaar overgewicht" + " hebt.");
        }
    }
}


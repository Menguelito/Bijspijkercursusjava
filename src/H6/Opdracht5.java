package H6;

import java.util.Locale;
import java.util.Scanner;

public class Opdracht5 {

    private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    private static int input;

    public static void main(String[] args) {
        System.out.println("Van welk getal wil je de weekdag weten?");
        input = sc.nextInt();
        System.out.println(bepaalDag(input));
    }

    private static String bepaalDag(int dagnummer) {
        String dag = null;
        if (dagnummer == 1) {
            dag = "maandag";
        }
        if (dagnummer == 2) {
            dag = "dinsdag";
        }
        if (dagnummer == 3) {
            dag = "woensdag";
        }
        if (dagnummer == 4) {
            dag = "donderdag";
        }
        if (dagnummer == 5) {
            dag = "vrijdag";
        }
        if (dagnummer == 6) {
            dag = "zaterdag";
        }
        if (dagnummer == 7) {
            dag = "zondag";
        }
        return "Bij nummer " + dagnummer + " hoort de weekdag " + dag + ".";
    }
}
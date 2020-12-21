package H6;

import java.util.Locale;
import java.util.Scanner;

public class Opdracht6 {

    private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    private static int input;

    public static void main(String[] args) {
        System.out.println("Van welk getal wil je weten of het een even getal is?");
        input = sc.nextInt();
        if (isEvenGetal(input) == true) {
            System.out.println("Het getal " + input + " is een even getal.");
        } else {
            System.out.println("Het getal " + input + " is geen even getal.");
        }
    }

    private static boolean isEvenGetal(int getal) {
        boolean evenGetal;
        if (getal % 2 == 0) {
            evenGetal = true;
        } else {
            evenGetal = false;
        }
        return evenGetal;
    }
}
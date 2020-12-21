package H4;

import java.util.Locale;
import java.util.Scanner;

public class Opdracht3 {

    private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    private static char input;

    public static void main(String[] args) {
        System.out.println("Van welke letter wil je weten of het een klinker is?");
        input = sc.nextLine().charAt(0);

        if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u' || input == 'y') {
            System.out.println("De " + input + " is een " + "klinker");
        } else {
            System.out.println("De " + input + " is een " + "medeklinker");
        }
    }
}

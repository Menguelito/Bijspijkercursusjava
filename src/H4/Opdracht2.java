package H4;

import java.util.Locale;
import java.util.Scanner;

public class Opdracht2 {

    private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    private static char input;
    private static boolean isLetter;

    public static void main(String[] args) {
        System.out.println("Van welk karakter wil je weten of het een getal of letter is?");

        input = sc.nextLine().charAt(0);
        isLetter = Character.isLetter(input);

        if (isLetter == true) {
            System.out.println("De " + input + " is een " + "letter");
        } else {
            System.out.println("De " + input + " is een " + "getal");
        }
    }
}
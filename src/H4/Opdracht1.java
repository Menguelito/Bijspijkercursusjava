package H4;

import java.util.Locale;
import java.util.Scanner;

public class Opdracht1 {

    private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    private static char input;
    private static int asciiValue;

    public static void main(String[] args) {
        System.out.println("Van welk karakter wil je de ASCII waarde weten?");

        input = sc.nextLine().charAt(0);
        asciiValue = input;

        System.out.println("De ASCII waarde van het karakter " + input + " is " + asciiValue);
    }
}

package H4;

import java.util.Locale;
import java.util.Scanner;

public class Opdracht6 {

    private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    private static String input;

    public static void main(String[] args) {
        System.out.println("Typ een String:");
        input = sc.nextLine();

        System.out.println("De lengte van de String is " + input.length());
        System.out.println("Het eerste karakter is " + input.charAt(0));
        System.out.println("Het laatste karakter is " + input.charAt(input.length() - 1));
    }
}
package H2;

import java.util.Locale;
import java.util.Scanner;

public class Opdracht2 {

    private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    private static double jaren;
    private static double maanden;
    private static int minuten;

    public static void main(String[] args) {
        System.out.println("Hoeveel jaar oud ben je?");
        jaren = sc.nextDouble();
        System.out.println("Hoeveel maanden komen daar nog bij?");
        maanden = sc.nextDouble();
        minuten = (int) ((jaren * 365 * 24 * 60) + (maanden / 12 * 365 * 24 * 60));
        System.out.println("Dan ben je nu ongeveer " + minuten + " minuten oud.");
    }
}

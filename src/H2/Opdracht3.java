package H2;
import java.util.Locale;
import java.util.Scanner;

public class Opdracht3 {

    private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    private static double startBedrag;
    private static double rentePercentage;
    private static double totaalBedrag;

    public static void main(String[] args) {
        System.out.println("Typ het startbedrag:");
        startBedrag = sc.nextDouble();
        System.out.println("Typ het rentepercentage: ");
        rentePercentage = sc.nextDouble() / 10;
        totaalBedrag = startBedrag + rentePercentage;
        System.out.println("De rente is " + rentePercentage + " en het "
                + "totaalbedrag is " + totaalBedrag);
    }
}

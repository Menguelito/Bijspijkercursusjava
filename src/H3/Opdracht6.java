package H3;

import java.util.Locale;
import java.util.Scanner;

public class Opdracht6 {

    private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    private static int getal1, getal2, getal3;

    public static void main(String[] args) {
        System.out.println("Getal 1: ");
        getal1 = sc.nextInt();
        System.out.println("De gebruiker typt " + getal1 + "\n");

        System.out.println("Getal 2: ");
        getal2 = sc.nextInt();
        System.out.println("De gebruiker typt " + getal2 + "\n");

        System.out.println("Getal 3: ");
        getal3 = sc.nextInt();
        System.out.println("De gebruiker typt " + getal3 + "\n");

        System.out.println("\n\n\n\n\n");

        System.out.println("Van klein naar groot: ");

        //checks lowest num
        if ((getal1 < getal2) && (getal1 < getal3)) {
//			System.out.println("lowest_1");
            System.out.print(getal1 + " - ");
        } else if ((getal2 < getal1) && (getal2 < getal3)) {
//			System.out.println("lowest_2");
            System.out.print(getal2 + " - ");
        } else if ((getal3 < getal1) && (getal3 < getal2)) {
//			System.out.println("lowest_3");
            System.out.print(getal3 + " - ");
        }

        //checks middle num 1
        if ((getal1 > getal2) && (getal1 < getal3)) {
//			System.out.println("middle_1");
            System.out.print(getal1 + " - ");
        } else if ((getal2 > getal1) && (getal2 < getal3)) {
//			System.out.println("middle_2");
            System.out.print(getal2 + " - ");
        } else if ((getal3 > getal1) && (getal3 < getal2)) {
//			System.out.println("middle_3");
            System.out.print(getal3 + " - ");
        }

        //checks middle num 2
        if ((getal1 < getal2) && (getal1 > getal3)) {
//			System.out.println("middle_4");
            System.out.print(getal1 + " - ");
        } else if ((getal2 < getal1) && (getal2 > getal3)) {
//			System.out.println("middle_5");
            System.out.print(getal2 + " - ");
        } else if ((getal3 < getal1) && (getal3 > getal2)) {
//			System.out.println("middle_6");
            System.out.print(getal3 + " - ");
        }

        //checks hightest num
        if ((getal1 > getal2) && (getal1 > getal3)) {
//			System.out.println("highest_1");
            System.out.print(getal1);
        } else if ((getal2 > getal1) && (getal2 > getal3)) {
//			System.out.println("highest_2");
            System.out.print(getal2);
        } else if ((getal3 > getal1) && (getal3 > getal2)) {
//			System.out.println("highest_3");
            System.out.print(getal3);
        }
    }
}
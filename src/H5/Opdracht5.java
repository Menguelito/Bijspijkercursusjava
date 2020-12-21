package H5;

import java.util.Locale;
import java.util.Scanner;

public class Opdracht5 {

    private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    private static String[] names = new String[5];
    private static double[] number = new double[5];

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Type de students naam " + (i + 1) + ": ");
            names[i] = sc.nextLine();

            System.out.println("Type de students cijfer " + (i + 1) + ": ");
            number[i] = Double.parseDouble(sc.nextLine());

            if (i >= 4) {
                if (number[0] > number[i]) {
                    System.out.println("hoogste cijfer is: " + number[0] + " en is van " + names[0]);
                } else if (number[1] > number[i]) {
                    System.out.println("hoogste cijfer is: " + number[1] + " en is van " + names[1]);
                } else if (number[2] > number[i]) {
                    System.out.println("hoogste cijfer is: " + number[2] + " en is van " + names[2]);
                } else if (number[3] > number[i]) {
                    System.out.println("hoogste cijfer is: " + number[3] + " en is van " + names[3]);
                } else {
                    System.out.println("hoogste cijfer is: " + number[4] + " en is van " + names[4]);
                }
            }
        }
    }
}
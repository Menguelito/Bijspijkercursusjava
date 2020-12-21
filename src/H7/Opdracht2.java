package H7;

import java.util.Locale;
import java.util.Scanner;

public class Opdracht2 {

    private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    private static int input;

    private static int[] intArray = new int[9];

    public static void main(String[] args) {

        System.out.println("Opdracht 7.2\n");

        System.out.println("Geef me 9 integers: ");

        for (int i = 0; i < intArray.length; i++) {
            input = sc.nextInt();
            intArray[i] = input;
        }

        System.out.println("Daar komen ze, in omgekeerde volgorde:");

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[intArray.length - 1 - i] + " ");
        }
    }
}

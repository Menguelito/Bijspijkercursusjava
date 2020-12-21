package H6;

import java.util.Locale;
import java.util.Scanner;

public class Opdracht2{
    private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    private static String input;

    public static void main(String[] args) {
        System.out.println("Welk zinnete moet ik printen?");
        input = sc.nextLine();
        Opdracht2.printZinnetje(input);
    }

    private static void printZinnetje(String mooieZin) {
        System.out.println(mooieZin);
    }
}
package H5;

import java.util.Locale;
import java.util.Scanner;

public class Opdracht1 {

    private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    private static double input;

    //Note, getal kan boven 10 gaan.
    //Zet gewoon een else if statement, die checkt of die hoger is dan 10.
    //En closed de scanner.
    public static void main(String[] args) {
        int i = 0;
        while(i == 0) {
            System.out.println("Wat is je toetscijfer?");
            input = sc.nextDouble();
            if (input >= 5.5) {
                System.out.println("Je hebt een voldoende!");
            } else if (input <= 5.4 && input >= 1.0) {
                System.out.println("Helaas, je hebt een onvoldoende.");
            } else if (input < 1.0) {
                System.out.println("Tot ziens!");
                sc.close();
            }
        }
    }
}
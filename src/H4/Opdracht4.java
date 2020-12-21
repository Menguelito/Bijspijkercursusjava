package H4;

import java.util.Locale;
import java.util.Scanner;

public class Opdracht4 {

    private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    private static char input;

    public static void main(String[] args) {
        System.out.println("Van welke letter wil je het nummer weten?");
        input = sc.nextLine().charAt(0);

        if (input == 'a' || input == 'b' || input == 'c') {
            System.out.println("De letter " + input + " staat op de 2-toets");
        } else if (input == 'd' || input == 'e' || input == 'f') {
            System.out.println("De letter " + input + " staat op de 3-toets");
        } else if (input == 'g' || input == 'h' || input == 'i') {
            System.out.println("De letter " + input + " staat op de 4-toets");
        } else if (input == 'j' || input == 'k' || input == 'l') {
            System.out.println("De letter " + input + " staat op de 5-toets");
        } else if (input == 'm' || input == 'n' || input == 'o') {
            System.out.println("De letter " + input + " staat op de 6-toets");
        } else if (input == 'p' || input == 'q' || input == 'r' || input == 's') {
            System.out.println("De letter " + input + " staat op de 7-toets");
        } else if (input == 't' || input == 'u' || input == 'v') {
            System.out.println("De letter " + input + " staat op de 8-toets");
        } else if (input == 'w' || input == 'x' || input == 'y' || input == 'z') {
            System.out.println("De letter " + input + " staat op de 9-toets");
        }
    }
}

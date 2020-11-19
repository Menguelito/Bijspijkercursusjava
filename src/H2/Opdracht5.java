package H2;

import java.util.Locale;
import java.util.Scanner;

public class Opdracht5 {

    private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    private static int userInput;
    private static int digits1, digits2, digits3;

    public static void main(String[] args) {
        System.out.println("Typ een getal tussen 0 en 1000");
        userInput = sc.nextInt();

        if(userInput >= 0 && userInput <= 1000) {
            digits1 = userInput % 10;
            userInput /= 10;
            digits2 = userInput % 10;
            userInput /= 10;
            digits3 = userInput % 10;
            userInput /= 10;
        }

        System.out.println("De vermenigvuldigen van de cijfers luidt: " + digits1
                + " x " + digits2 + " x " + digits3 + " = " + (digits1 * digits2 * digits3));
    }
}

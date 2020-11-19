package H2;
import java.util.Locale;
import java.util.Scanner;

public class Opdracht4 {

    private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    private static double userInput;

    public static void main(String[] args) {
        userInput = sc.nextDouble();
        for(int i = 2; i > -3; i--) {
            System.out.println(userInput - i);
        }
    }
}

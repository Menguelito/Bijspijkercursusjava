package H3;
import java.util.Scanner;

public class Opdracht4 {

    private static Scanner scanner = new Scanner(System.in);
    private static int weekdag;
    private static int som;
    private static int nieuweWeekdag;

    private static String weekdagStr;

    public static void main(String[] args) {

        System.out.println(7 % 7);

        System.out.println("Voer een een weekdag in, \"weekdagen zijn in getallen.\"");
        weekdag = scanner.nextInt();
        checkWeekdag();
        System.out.println("Het is nu " + weekdagStr + "\n");

        System.out.println("Voer nu een getal in, \n"
                + "deze wordt opgeteld met de weekdagen \nen kijken wat de nieuwe week dag is.");
        som = scanner.nextInt();
        nieuweWeekdag = som + weekdag;
        checkNieuweWeekdag();

        System.out.println("Nieuwe weekdag is: " + weekdagStr);
    }

    private static void checkWeekdag() {
        if(weekdag == 1) {
            weekdagStr = "maandag";
        }
        if(weekdag == 2) {
            weekdagStr = "dinsdag";
        }
        if(weekdag == 3) {
            weekdagStr = "woensdag";
        }
        if(weekdag == 4) {
            weekdagStr = "donderdag";
        }
        if(weekdag == 5) {
            weekdagStr = "vrijdag";
        }
        if(weekdag == 6) {
            weekdagStr = "zaterdag";
        }
        if(weekdag == 7) {
            weekdagStr = "zondag";
        }
    }

    private static void checkNieuweWeekdag() {
        if(nieuweWeekdag % 7 == 1) {
            weekdagStr = "maandag";
        }
        if(nieuweWeekdag % 7 == 2) {
            weekdagStr = "dinsdag";
        }
        if(nieuweWeekdag % 7 == 3) {
            weekdagStr = "woensdag";
        }
        if(nieuweWeekdag % 7 == 4) {
            weekdagStr = "donderdag";
        }
        if(nieuweWeekdag % 7 == 5) {
            weekdagStr = "vrijdag";
        }
        if(nieuweWeekdag % 7 == 6) {
            weekdagStr = "zaterdag";
        }
        if(nieuweWeekdag % 7 == 0) {
            weekdagStr = "zondag";
        }
    }
}
package H7;

import java.util.Locale;
import java.util.Scanner;

public class Opdracht3 {

    private static Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    private static double input;

    private static double[] mooieArray = new double[10];
    private static double gemiddelde = 0;
    private static int highAverage = 0;

    public static void main(String[] args) {
        System.out.println("Opdracht7.3");
        System.out.println("Geef me nu 10 doubles, dan bereken ik het gemiddelde en tel ik hoeveel cijfers hoger zijn:");

        initMooieArray();
        calcAverage();
        countAboveAverage();
    }

    /* het initialeren voor het mooie array.*/
    private static void initMooieArray() {
        for (int i = 0; i < mooieArray.length; i++) {
            input = sc.nextDouble();
            mooieArray[i] = input;
        }
    }

    /*het gemiddelde berekenen.*/
    private static void calcAverage() {
        for (double i : mooieArray) {
            gemiddelde += i;
        }
        gemiddelde /= 10;
        System.out.println("Het gemiddelde is " + gemiddelde);
    }

    /*berekent nu hoeveel boven de gemiddelde is.*/
    private static void countAboveAverage() {
        for (int i = 0; i < mooieArray.length; i++) {
            if (mooieArray[i] > gemiddelde) {
                highAverage++;
            }
        }
        System.out.println("Het aantal doubles boven het gemiddelde is: " + highAverage);
    }
}
package H8;

import java.util.Locale;
import java.util.Scanner;

public class OPDR5 {

    //NOTE: scanner is alleen in deze class gebruikt.
    public static Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    private static int userChoice;
    private static int selectedChannel;
    private static int selectedVolumeLevel;

    public static void main(String[] args) {
        Televisie myFirstTelevision = new Televisie();

        keuzeMap();

        boolean exit = false;
        while(exit == false) {
            userChoice = sc.nextInt();

            switch(userChoice) {
                case 1: {
                    myFirstTelevision.turnOn();
                    keuzeMap();
                    break;
                }
                case 2: {
                    myFirstTelevision.turnOff();
                    keuzeMap();
                    break;
                }
                case 3: {
                    myFirstTelevision.channelUp();
                    keuzeMap();
                    break;
                }
                case 4: {
                    myFirstTelevision.channelDown();
                    keuzeMap();
                    break;
                }
                case 5: {
                    myFirstTelevision.volumeUp();
                    keuzeMap();
                    break;
                }
                case 6: {
                    myFirstTelevision.volumeDown();
                    keuzeMap();
                    break;
                }
                case 7: {
                    System.out.println("Select your channel: ");
                    selectedChannel = sc.nextInt();
                    myFirstTelevision.setChannel(selectedChannel);
                    keuzeMap();
                    break;
                }
                case 8: {
                    System.out.println("Select your volume level: ");
                    selectedVolumeLevel = sc.nextInt();
                    myFirstTelevision.setVolume(selectedVolumeLevel);
                    keuzeMap();
                    break;
                }
                case 9: {
                    exit = true;
                    System.out.println("exit");
                    System.exit(0);
                    break;
                }
            }
        }
    }

    public static void keuzeMap() {
        System.out.println();
        System.out.println("1. ON");
        System.out.println("2. OFF");
        System.out.println("3. CHANNEL UP");
        System.out.println("4. CHANNEL DOWN");
        System.out.println("5. VOLUME UP");
        System.out.println("6. VOLUME DOWN");
        System.out.println("7. SET CHANNEL");
        System.out.println("8. SET VOLUME LEVEL");
        System.out.println("9. EXIT");
        System.out.println();
        System.out.println("Maak uw keuze:");
    }
}
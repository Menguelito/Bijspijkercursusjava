package H3;

public class Opdracht2 {

    private static int ran1 = (int) (Math.random() * 10 + 1);
    private static int ran2 = (int) (Math.random() * 10 + 1);
    private static int ran3 = (int) (Math.random() * 10 + 1);

    public static void main(String[] args) {
        System.out.println("Hoeveel is " + ran1 + " x " + ran2 + " x " + ran3 + " = " + (ran1 * ran2 * ran3));
    }
}

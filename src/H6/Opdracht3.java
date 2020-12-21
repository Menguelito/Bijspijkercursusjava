package H6;

public class Opdracht3 {

    private static int random1, random2;

    public static void main(String[] args) {
        random1 = (int) (Math.random() * 10 + 1);
        random2 = (int) (Math.random() * 10 + 1);
        System.out.println("Het product van " + random1 + " en " + random2 + " is " + berekenProduct(random1, random2));
    }

    private static int berekenProduct(int getal1, int getal2) {
        return getal1 * getal2;
    }
}

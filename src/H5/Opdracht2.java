package H5;

public class Opdracht2 {

    private static int ran1, ran2, ran3;

    //getal 1 tussen 50 en 150.
    //getal 2 tussen 25 en 225.
    //getal 3 tussen 100 en 150.

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            ran1 = (int) (Math.random() * 100 + 50);
            ran2 = (int) (Math.random() * 200 + 25);
            ran3 = (int) (Math.random() * 50 + 100);
            System.out.println("willekeurige 3 getallen som:");
            System.out.println(ran1 + " + " + ran2 + " + " + ran3 + " = " + (ran1 + ran2 + ran3));
            System.out.println();
        }
    }
}
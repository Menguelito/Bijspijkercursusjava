package H7;

public class Opdracht1 {

    private static int[][] dobbelsteenWorpen = new int[10][10];
    private static int randomDobbelsteenNum;

    public static void main(String[] args) {

        System.out.println("Opdracht 7.1\n");
        System.out.println("Hier komen 100 worpen met een dobbelsteen:\n");

        for (int j = 0; j < dobbelsteenWorpen.length; j++) {
            for (int i = 0; i < dobbelsteenWorpen.length; i++) {
                randomDobbelsteenNum = (int) (Math.random() * 6 + 1);
                dobbelsteenWorpen[j][i] = randomDobbelsteenNum;
                System.out.print(dobbelsteenWorpen[j][i]);

                //if statement, wanneer een spatie tussen een getal zit.
                if (i < dobbelsteenWorpen.length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
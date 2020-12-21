package H4;

public class Opdracht5 {

    private static int randomNum;

    public static void main(String[] args) {
        randomNum = (int) (Math.random() * 26 + 97);
        System.out.println("Uw willekeurige letter is de '" + (char) randomNum + "'." /*+ "\t\t " + randomNum*/);
    }
}
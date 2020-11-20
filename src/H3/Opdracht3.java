package H3;
import java.util.ArrayList;

public class Opdracht3 {

    private static int ranMonthNum = (int) (Math.random() * 12 + 1);
    private static ArrayList<String> months = new ArrayList<String>();

    public static void main(String[] args) {
        months.add("januari"); // maand 1
        months.add("februari"); // maand 2
        months.add("maart"); // maand 3
        months.add("april"); // maand 4
        months.add("mei"); // maand 5
        months.add("juni"); // maand 6
        months.add("juli"); // maand 7
        months.add("augustus"); // maand 8
        months.add("september"); // maand 9
        months.add("oktober"); // maand 10
        months.add("november"); // maand 11
        months.add("december"); // maand 12

//		for(int j = 1; j < 100; j++) {
//			ranMonthNum = (int) (Math.random() * 12 + 1);
        for(int i = 1; i <= 12; i++) {
            if(ranMonthNum == i) {
                System.out.println("Het random getal is " + i + " en dat is de maand " + months.get(i - 1));
            }
        }
//		}
    }
}

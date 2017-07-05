import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Created by chand on 7/5/2017.
 */
public class Lab8Methods {

    public static void battingAvg(double score, double sumNum) {
        NumberFormat numberFormat = new DecimalFormat("#0.000");
        double average = score / sumNum;
        System.out.println("Batting Average: " + numberFormat.format(average));
    }

    public static double hits(double[] scores) {
        int hit = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > 0) {
                hit = hit + 1;
            }
        }
        return hit;
    }

    public static void sluggingP(double sumNum, double scoreLength) {
        NumberFormat numberFormat = new DecimalFormat("#0.000");
        double slug = sumNum / scoreLength;
        System.out.println("Slugging Percentage: " + numberFormat.format(slug));
    }

    public static double sumOfScores(double[] scores) {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum;
    }

    public static void getAtBat(double[] scores) {
        Scanner keyboard = new Scanner(System.in);
        String prompt2 = "Result for at-bat: ";
        for (int i = 0; i < scores.length; i++) {
            scores[i] = Validator.getInt(keyboard, prompt2, 0, 4);
        }
    }

    public static String yOrNValid(String yOrN) {
        Scanner keyboard = new Scanner(System.in);
        while (!yOrN.equalsIgnoreCase("y") && !yOrN.equalsIgnoreCase("n")) {
            System.out.println("Invalid Input. Please enter Y or N: ");
            yOrN = keyboard.nextLine();
        }
        return yOrN;
    }
}

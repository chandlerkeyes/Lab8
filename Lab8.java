import java.util.Scanner;

public class Lab8 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String yOrN;
        String yOrN1;

        do {
            System.out.println("Welcome to Batting Average Calculator!");
            double[] scores = new double[Validator.getInt(keyboard, "Enter number of times at bat:", 1, 100)];
            System.out.println();
            System.out.println("0=out, 1=single, 2=double, 3=triple, 4=home run");
            Lab8Methods.getAtBat(scores);
            Lab8Methods.battingAvg(Lab8Methods.hits(scores), scores.length);
            Lab8Methods.sluggingP(Lab8Methods.sumOfScores(scores), scores.length);
            System.out.println("Another batter? (y/n)");
            yOrN = keyboard.nextLine();
            yOrN1 = Lab8Methods.yOrNValid(yOrN);
        } while (yOrN1.equalsIgnoreCase("y"));
        System.out.println("Thanks for your time.");
    }

}
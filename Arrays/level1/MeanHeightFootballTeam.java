import java.util.Scanner;

public class MeanHeightFootballTeam {
    public static void main(String[] args) {
        double[] heights = new double[11];
        double sum = 0.0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height for player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }
        double mean = sum / heights.length;
        System.out.printf("The mean height of the football team is %.2f\n", mean);
        sc.close();
    }
}

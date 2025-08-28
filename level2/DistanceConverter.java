package level2;

import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = sc.nextDouble();
        double distanceInYards = distanceInFeet / 3.0;
        double distanceInMiles = distanceInYards / 1760.0;
        System.out.printf("The distance in yards is %.2f while the distance in miles is %.5f\n", distanceInYards, distanceInMiles);
        sc.close();
    }
}

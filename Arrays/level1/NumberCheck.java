import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define array of 5 elements
        int[] numbers = new int[5];

        // Take user input
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("\nResults:");
        // Loop through array and check conditions
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];

            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println("Number " + num + " is Positive and Even.");
                } else {
                    System.out.println("Number " + num + " is Positive and Odd.");
                }
            } else if (num < 0) {
                System.out.println("Number " + num + " is Negative.");
            } else {
                System.out.println("Number is Zero.");
            }
        }

        // Compare first and last element
        System.out.println("\nComparison of first and last element:");
        if (numbers[0] == numbers[4]) {
            System.out.println("First element " + numbers[0] + " is EQUAL to last element " + numbers[4]);
        } else if (numbers[0] > numbers[4]) {
            System.out.println("First element " + numbers[0] + " is GREATER than last element " + numbers[4]);
        } else {
            System.out.println("First element " + numbers[0] + " is LESS than last element " + numbers[4]);
        }

        sc.close();
    }
}

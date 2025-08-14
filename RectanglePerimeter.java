import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter width of rectangle: ");
        double width = sc.nextDouble();

        // Calculating perimeter
        double perimeter = 2 * (length + width);

        // Output result
        System.out.println("Perimeter of the rectangle is: " + perimeter);

        sc.close();
    }
}


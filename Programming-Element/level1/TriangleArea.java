
package level1;
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base of the triangle in centimeters: ");
        double base = sc.nextDouble();
        System.out.print("Enter height of the triangle in centimeters: ");
        double height = sc.nextDouble();

        double areaCm2 = 0.5 * base * height;
        double areaIn2 = areaCm2 / 6.4516; // 1 in^2 = 6.4516 cm^2

        System.out.printf("The area of the triangle is %.2f square centimeters and %.2f square inches.\n", areaCm2, areaIn2);
        sc.close();
    }
}

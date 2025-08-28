package level2;

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

        System.out.printf("The Area of the triangle in sq in is %.2f and sq cm is %.2f\n", areaIn2, areaCm2);
        sc.close();
    }
}

public class PenDistribution {
    public static void main(String[] args) {
        int totalPens = 14;
        int students = 3;

        // Division for pens per student
        int pensPerStudent = totalPens / students;

        // Modulus for remaining pens
        int remainingPens = totalPens % students;

        // Output
        System.out.println("The Pen Per Student is " + pensPerStudent +
                           " and the remaining pen not distributed is " + remainingPens);
    }
}

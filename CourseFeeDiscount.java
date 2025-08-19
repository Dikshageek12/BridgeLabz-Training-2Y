public class CourseFeeDiscount {
    public static void main(String[] args) {
        // Given values
        int fee = 125000;
        int discountPercent = 10;

        // Calculations
        int discount = (fee * discountPercent) / 100;
        int finalFee = fee - discount;

        // Output
        System.out.println("The discount amount is INR " + discount + 
                           " and final discounted fee is INR " + finalFee);
    }
}


public class ProfitLoss {
    public static void main(String[] args) {
        // Given values
        int costPrice = 129;
        int sellingPrice = 191;

        // Calculations
        int profit = sellingPrice - costPrice;
        double profitPercentage = (profit / (double) costPrice) * 100;

        // Single print statement with multiline text
        System.out.println(
                "The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
                        "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
    }
}

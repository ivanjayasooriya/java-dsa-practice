package dsa;

public class BestTimeToBuyAndSell {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};

        int minPrice = arr[0];
        int maxProfit = 0;

        for (int price : arr) {
            if (price < minPrice) {
                minPrice = price;
            }

            int profit = price - minPrice;

            if (maxProfit < profit) {
                maxProfit = profit;
            }
        }

        System.out.println("Max profit: " + maxProfit);
    }
}

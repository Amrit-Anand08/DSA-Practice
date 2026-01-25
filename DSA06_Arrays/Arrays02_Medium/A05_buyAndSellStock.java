public class A05_buyAndSellStock {
    public static int bruteForce(int[] arr) {
        int maxProfit = 0;
        // for buy stock
        for (int i = 0; i < arr.length; i++) {
            // for sell stock
            for (int j = i + 1; j < arr.length; j++) {
                int profit = arr[j] - arr[i];
                maxProfit = Math.max(profit, maxProfit);
            }
        }
        return maxProfit;
    }

    public static int optimalApproach(int[] arr) {

        int maxProfit = 0;

        // purchased day when stock is minimum
        int minPrice = Integer.MAX_VALUE;

        // for Selling Today
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minPrice) {
                minPrice = arr[i];
            } else {
                int profit = arr[i] - minPrice;
                maxProfit = Math.max(profit, maxProfit);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };

        // method 1
        // int maxProfit = bruteForce(arr);

        // method 2
        int maxProfit = optimalApproach(arr);

        System.out.println("Max Profit is : " + maxProfit);
    }
}

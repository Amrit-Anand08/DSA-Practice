// Problem Statement: You are given an array of prices where prices[i] is the price of a given stock on an ith day. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
/*
Examples
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note: That buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
*/

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
        // No Profit, Return Zero Profit
        if (maxProfit <= 0) {
            return 0;
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
        // No Profit, Return Zero Profit
        if (maxProfit <= 0) {
            return 0;
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 1, 5, 3, 6, 4 };

        // method 1
        // int maxProfit = bruteForce(arr);

        // method 2
        int maxProfit = optimalApproach(arr);

        // No Profit, Return Zero Profit
        if (maxProfit != 0) {
            System.out.println("Max Profit is : " + maxProfit);
        } else {
            System.out.println("Not any Profit.");
        }
    }
}

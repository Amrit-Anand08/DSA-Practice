// Kadane's Algorithm : Maximum Subarray Sum in an Array
// Problem Statement: Given an integer array arr, find the subarray with the largest sum and return the sum of the elements present in that subarray.
// subarray is a contiguous non-empty sequence of elements within an array.
/*
Example 1:
Input:
 arr = [2, 3, 5, -2, 7, -4]  
Output:
 15  
Explanation:
 The subarray from index 0 to index 4 has the largest sum = 15, which is the Maximum sum of any contiguous subarray.

Example 2:
Input:
 arr = [-2, -3, -7, -2, -10, -4]  
Output:
 -2  
Explanation:
 The largest sum is -2, which comes from taking the element at index 0 or index 3 as the subarray. Since all numbers are negative, the subarray with the least negative number gives the largest sum.
*/

public class A04_MaximumSumSubarray {
    public static int usingBruteForce(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                max = Math.max(max, sum);
            }
        }
        return max;
    }

    public static int usingOptimal(int[] arr) {
        long max = Long.MIN_VALUE;
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return (int) max;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, -2, 7, -4 };
        // Point to be Noted that :
        // the SubArray Should (Continous + Maximum)

        // method 1
        // int max = usingBruteForce(arr);

        // method 2
        int max = usingOptimal(arr);

        System.out.print("Maximum Sum of subarray is : " + max);
    }
}
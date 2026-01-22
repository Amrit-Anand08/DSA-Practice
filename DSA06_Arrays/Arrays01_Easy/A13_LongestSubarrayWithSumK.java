// Problem Statement: Given an array nums of size n and an integer k, find the length of the longest sub-array that sums to k. If no such sub-array exists, return 0.
/*
Example 1:
Input:
 nums = [10, 5, 2, 7, 1, 9], k = 15  
Output:
 4  
Explanation:
 The longest sub-array with a sum equal to 15 is [5, 2, 7, 1], which has a length of 4. This sub-array starts at index 1 and ends at index 4, and the sum of its elements (5 + 2 + 7 + 1) equals 15. Therefore, the length of this sub-array is 4.

Example 2:
Input:
 nums = [-3, 2, 1], k = 6  
Output:
 0  
Explanation:
 There is no sub-array in the array that sums to 6. Therefore, the output is 0.
*/ 

import java.util.*;

public class A13_LongestSubarrayWithSumK {
    public static int BruteForce(int[] arr, int k) {
        int maxLength = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    System.out.println("From Index " + i + " to " + j + " Sum is equals to K");
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }
        return maxLength;
    }

    public static int UsingSlidingWindow(int[] arr, int k) {
        int n = arr.length;
        int maxLength = 0;

        int left = 0, right = 0;
        // Sum of the current window
        int sum = arr[0];
        // Traverse through the array
        while (right < n) {

            // Shrink the window if sum exceeds k
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }
            // Update max length if sum equals k
            if (sum == k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }

            // Expand the window to the right
            right++;
            if (right < n) {
                sum += arr[right];
            }
        }

        return maxLength;
    }

    public static int usingHashMap(int[] a, int k) {
        int n = a.length;
        Map<Integer, Integer> preSumMap = new HashMap<>(); // prefix sum -> index
        int sum = 0; // Running sum
        int maxLen = 0; // Longest subarray length

        for (int i = 0; i < n; i++) {
            sum += a[i]; // Update running prefix sum

            // Case 1: If full subarray from 0 to i has sum = k
            if (sum == k) {
                maxLen = i + 1;
            }

            // Case 2: If (sum - k) was seen before
            int rem = sum - k;
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem); // Length of current valid subarray
                maxLen = Math.max(maxLen, len);
            }

            // Store the first occurrence of a prefix sum
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 5, 2, 7, 1, 9 };
        int k = 15;

        // method 1
        // int maxLength = BruteForce(arr, k);

        // method 2
        // int maxLength = UsingSlidingWindow(arr, k);

        // method 3
        int maxLength = usingHashMap(arr, k);

        if (maxLength == 0) {
            System.out.println("No Such SubArray Found");
        } else {
            System.out.println("Longest Subarray Length is : " + maxLength);
        }
    }
}

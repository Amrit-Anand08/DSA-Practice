// Problem Statement: Given an array that contains only 1 and 0 return the count of maximum consecutive ones in the array..
/*
Example 1:
Input: prices = {1, 1, 0, 1, 1, 1}
Output: 3
Explanation: There are two consecutive 1’s and three consecutive 1’s in the array out of which maximum is 3.

Example 2:
Input: prices = {1, 0, 1, 1, 0, 1} 
Output: 2
Explanation: There are two consecutive 1's in the array. 
*/

public class A11_MaxConsequtiveOnces {
    public static int maxStreakFind(int[] arr) {
        int maxStreak = 0;
        int streak = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                streak++;
                maxStreak = Math.max(maxStreak, streak);
            } else {
                streak = 0;
            }
        }
        return maxStreak;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1 };
        int maxStreak = maxStreakFind(arr);
        System.out.println(maxStreak);
    }
}

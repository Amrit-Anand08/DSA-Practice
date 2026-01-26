// Problem Statement: Leaders in an Array
/*
Example 1:
Input: arr = [4, 7, 1, 0]  
Output: 7 1 0  
Explanation: The rightmost element (0) is always a leader.  
7 and 1 are greater than the elements to their right, making them leaders as well.

Example 2:
Input: arr = [10, 22, 12, 3, 0, 6]  
Output: 22 12 6  
Explanation: 6 is a leader because there are no elements after it.  
12 is greater than all the elements to its right (3, 0, 6), and 22 is greater than 12, 3, 0, 6, making them leaders as well.
*/

import java.util.ArrayList;
import java.util.Collections;

public class A08_findArrayLeaders {
    public static ArrayList<Integer> leaders(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();

        int max = nums[nums.length - 1];
        ans.add(nums[nums.length - 1]);

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > max) {
                ans.add(nums[i]);
                max = nums[i];
            }
        }

        // Reversing the list to match the required output order
        Collections.reverse(ans);

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 22, 12, 3, 0, 6 };

        ArrayList<Integer> ans = leaders(arr);

        for (int elem : ans) {
            System.out.print(elem + ", ");
        }
    }
}
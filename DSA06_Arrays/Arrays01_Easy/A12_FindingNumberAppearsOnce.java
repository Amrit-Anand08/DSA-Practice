// Problem Statement: Given a non-empty array of integers arr, every element appears twice except for one. Find that single one.
/*
Example 1:
Input Format: arr[] = {2,2,1}
Result: 1
Explanation: In this array, only the element 1 appear once and so it is the answer.

Example 2:
Input Format: arr[] = {4,1,2,1,2}
Result: 4
Explanation: In this array, only element 4 appear once and the other elements appear twice. So, 4 is the answer.
*/

public class A12_FindingNumberAppearsOnce {
    public static int bruteForce(int[] arr) {
        boolean flag;
        for (int i = 0; i < arr.length; i++) {
            flag = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                return arr[i];
            }
        }
        return -1;
    }

    public static int byHashing(int[] arr) {
        int n = arr.length;

        // Step 1: Find maximum element
        int maxi = arr[0];
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, arr[i]);
        }
        // Step 2: Create frequency array of size maxi+1
        int[] hash = new int[maxi + 1];
        // Step 3: Count frequencies
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }
        // Step 4: Find element with frequency = 1
        for (int i = 0; i < n; i++) {
            if (hash[arr[i]] == 1)
                return arr[i];
        }
        return -1; // fallback
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 2, 3, 5, 3, 1, 4 };

        // method 1
        // int ans = bruteForce(arr);

        // method 2
        int ans = byHashing(arr);

        System.out.println(ans);
    }
}

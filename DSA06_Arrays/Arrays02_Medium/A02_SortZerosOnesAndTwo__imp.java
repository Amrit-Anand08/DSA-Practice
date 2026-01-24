// Problem Statement: Given an array nums consisting of only 0, 1, or 2. Sort the array in non-decreasing order. The sorting must be done in-place, without making a copy of the original array.
/*
Examples
Input: nums = [1, 0, 2, 1, 0]
Output: [0, 0, 1, 1, 2]
Explanation: The nums array in sorted order has 2 zeroes, 2 ones and 1 two

Input: nums = [0, 0, 1, 1, 1]
Output: [0, 0, 1, 1, 1]
Explanation: The nums array in sorted order has 2 zeroes, 3 ones and zero twos.
*/

public class A02_SortZerosOnesAndTwo__imp {
    public static void usingBruteForce(int[] arr) {
        int zeroCount = 0;
        int oneCount = 0;
        int twoCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroCount += 1;
            } else if (arr[i] == 1) {
                oneCount += 1;
            } else if (arr[i] == 2) {
                twoCount += 1;
            }
        }
        int i = 0;
        while (zeroCount != 0) {
            arr[i] = 0;
            zeroCount--;
            i++;
        }
        while (oneCount != 0) {
            arr[i] = 1;
            oneCount--;
            i++;
        }
        while (twoCount != 0) {
            arr[i] = 2;
            twoCount--;
            i++;
        }

        for (int elem : arr) {
            System.out.print(elem + ", ");
        }

    }

    public static void usingThreePointer(int[] arr) {
        // CORE IDEA: we main three positions
        // low = for 0s, mid = 1s, high = for 2s and iterate entire Array
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else if (arr[mid] == 2) {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }

        for (int elem : arr) {
            System.out.print(elem + ", ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 2, 1, 0 };

        // method 1
        // usingBruteForce(arr);

        // method 2
        usingThreePointer(arr);
    }
}

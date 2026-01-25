
// Problem Statement: There’s an array ‘A’ of size ‘N’ with an equal number of positive and negative elements. Without altering the relative order of positive and negative elements, you must return an array of alternately positive and negative values.
/*
Example 1:
Input:
arr[] = {1,2,-4,-5}, N = 4
Output:
1 -4 2 -5
Explanation: 
Positive elements = 1,2
Negative elements = -4,-5
To maintain relative ordering, 1 must occur before 2, and -4 must occur before -5.

Example 2:
Input:
arr[] = {1,2,-3,-1,-2,-3}, N = 6
Output:
1 -3 2 -1 3 -2
Explanation: 
Positive elements = 1,2,3
Negative elements = -3,-1,-2
To maintain relative ordering, 1 must occur before 2, and 2 must occur before 3.
Also, -3 should come before -1, and -1 should come before -2.
*/
import java.util.ArrayList;
import java.util.List;

public class A06_arrangeElementsBySign {
    public static void bruteForce(int[] arr) {

        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for (int x : arr) {
            if (x >= 0) {
                pos.add(x);
            } else {
                neg.add(x);
            }
        }

        int p = 0, n = 0, i = 0;
        while (p < pos.size() && n < neg.size()) {
            arr[i++] = pos.get(p++);
            arr[i++] = neg.get(n++);
        }
        while (p < pos.size()) {
            arr[i++] = pos.get(p++);
        }
        while (n < neg.size()) {
            arr[i++] = neg.get(n++);
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void OptimalSolution(int[] arr) {
        int[] ans = new int[arr.length];
        int posIndex = 0, negIndex = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                ans[negIndex] = arr[i];
                negIndex += 2;
            } else {
                ans[posIndex] = arr[i];
                posIndex += 2;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, -3, -1, -2, -3 };

        // method 1
        bruteForce(arr);
    }
}

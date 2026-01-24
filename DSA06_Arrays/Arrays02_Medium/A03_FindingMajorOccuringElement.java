
import java.util.HashMap;

/*
Example 1:
Input:
 arr = [7, 0, 0, 1, 7, 7, 2, 7, 7]  
Output:
 7  
Explanation:
 The number 7 appears 5 times in the 9-sized array, making it the most frequent element.

Example 2:
Input:
 arr = [1, 1, 1, 2, 1, 2]  
Output:
 1  
Explanation:
 The number 1 appears 4 times in the 6-sized array, making it the most frequent element.
*/
public class A03_FindingMajorOccuringElement {
    public static int usingBruteForce(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    if (count > (arr.length / 2)) {
                        max = Math.max(max, arr[i]);
                    }
                }
            }
        }
        return max;
    }

    public static int usingHashMap(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            // System.out.println(map.entrySet());
            if (map.get(arr[i]) > (arr.length) / 2) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int optimalSolution(int[] arr) {

        // Size of the given array
        int n = arr.length;
        // Count variable
        int cnt = 0;
        // Candidate element
        int el = 0;

        // Step 1: Find the potential majority element
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = arr[i];
            } else if (el == arr[i]) {
                cnt++;
            } else {
                cnt--;
            }
        }

        // Step 2: Verify the candidate
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == el) {
                cnt1++;
            }
        }

        // Return the element if it's a majority
        if (cnt1 > (n / 2)) {
            return el;
        }

        // No majority found
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 0, 0, 1, 7, 7, 2, 7, 7 };

        // method 1
        // int max = usingBruteForce(arr);

        // method 2
        // int max = usingHashMap(arr);

        // method 3
        int max = optimalSolution(arr);

        if (max != 0) {
            System.out.println("Maximum Occurring Element is : " + max);
        } else {
            System.out.println("No One Element is Occuring More than N/2");
        }
    }
}
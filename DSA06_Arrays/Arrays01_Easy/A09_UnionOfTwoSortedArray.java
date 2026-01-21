import java.util.*;

public class A09_UnionOfTwoSortedArray {
    public static void byTreeMap(int[] arr1, int[] arr2, int m, int n) {
        Map<Integer, Integer> tempMap = new TreeMap<>();
        for (int i = 0; i < m; i++) {
            tempMap.put(arr1[i], tempMap.getOrDefault(arr1[i], 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            tempMap.put(arr2[i], tempMap.getOrDefault(arr2[i], 0) + 1);
        }

        List<Integer> Union = new ArrayList<>();
        for (int key : tempMap.keySet()) {
            Union.add(key);
        }

        System.out.println(Union);
    }

    public static void byTreeSet(int[] arr1, int[] arr2, int m, int n) {
        Set<Integer> tempSet = new TreeSet<>();
        for (int elem : arr1) {
            tempSet.add(elem);
        }
        for (int elem : arr2) {
            tempSet.add(elem);
        }

        List<Integer> Union = new ArrayList<>();
        for (int elem : tempSet) {
            Union.add(elem);
        }

        System.out.println(Union);
    }

    public static void byTwoPointer(int[] arr1, int[] arr2, int m, int n) {
        List<Integer> union = new ArrayList<>();
        int i = 0, j = 0;

        while (i < m && j < n) {
            // Skip Duplicates
            if (i > 0 && arr1[i] == arr1[i - 1]) {
                i++;
                continue;
            }
            if (j > 0 && arr2[j] == arr2[j - 1]) {
                j++;
                continue;
            }

            // put values
            if (arr1[i] < arr2[j]) {
                union.add(arr1[i++]);
            } else if (arr1[i] > arr2[j]) {
                union.add(arr2[j++]);
            } else {
                union.add(arr1[i]);
                i++;
                j++;
            }
        }

        // Adding Rest Values
        while (i < m) {
            if (i == 0 || arr1[i] != arr1[i - 1]) {
                union.add(arr1[i]);
            }
            i++;
        }
        while (j < n) {
            if (j == 0 || arr2[j] != arr2[j - 1]) {
                union.add(arr2[j]);
            }
            j++;
        }

        System.out.println(union);
    }

    public static void main(String[] args) {
        int m = 10;
        int n = 7;
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] arr2 = { 2, 3, 4, 4, 5, 11, 12 };

        // === method 1 ===
        byTreeMap(arr1, arr2, m, n);

        // === method 2 ===
        byTreeSet(arr1, arr2, m, n);

        // === method 3 ===
        byTwoPointer(arr1, arr2, m, n);

    }
}

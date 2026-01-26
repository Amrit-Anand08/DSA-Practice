public class A07_findNextPermutation {
    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int idx = -1;
        // STEP 1: Find the break point
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                idx = i;
                break;
            }
        }
        // STEP 2: If no break point, reverse whole array
        if (idx == -1) {
            reverse(nums, 0, n - 1);
            return;
        }
        // STEP 3: Find next greater element and swap
        for (int i = n - 1; i > idx; i--) {
            if (nums[i] > nums[idx]) {
                swap(nums, i, idx);
                break;
            }
        }
        // STEP 4: Reverse the remaining right part
        reverse(nums, idx + 1, n - 1);
    }

    // Helper: reverse array
    private static void reverse(int[] arr, int l, int r) {
        while (l < r) {
            swap(arr, l++, r--);
        }
    }

    // Helper: swap elements
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 2 };

        nextPermutation(arr);
        for (int elem : arr) {
            System.out.print(elem + ",  ");
        }

    }
}

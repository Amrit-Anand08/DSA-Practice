
public class A10_FindingMissingNumberFromArray {
    public static int findMissing(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        return -1;
    }

    public static int findMissingByMath(int[] arr) {
        int n = arr.length + 1; // arr.length = n, but numbers starts from 1 and goes upto n+1
        int SumUptoN = (n * (n + 1)) / 2;

        int arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }

        System.out.println(SumUptoN);
        System.out.println(arrSum);

        int missingValue = (SumUptoN - arrSum);

        if (missingValue > 0) {
            return (SumUptoN - arrSum);
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 }; // missing number is 4

        // method 1
        // int ans = findMissing(arr);

        // method 2
        int ans = findMissingByMath(arr);

        if (ans == -1) {
            System.out.println("Nothing is Missing");
        } else {
            System.out.println("Missing Number is : " + ans);
        }
    }
}

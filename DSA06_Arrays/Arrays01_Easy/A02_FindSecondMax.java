public class A02_FindSecondMax {
    public static void main(String[] args) {
        int arr[] = { 10, 65, 27, 71, 100 };
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Max is : " + max);

        int Smax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (Smax < arr[i] && arr[i] != max) {
                Smax = arr[i];
            }
        }
        System.out.println("Second Max is : " + Smax);

    }
}

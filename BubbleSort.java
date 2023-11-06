import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {34, 8, 64, 51, 32, 21};
        int n = arr.length;
        int totalInversions = 0;

        for (int i = 0; i < n - 1; i++) {
            int stepInversions = 0;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    stepInversions++;
                    totalInversions++;

                    System.out.println("Inversion: (" + arr[j] + ", " + arr[j + 1] + ")");
                }
            }
            System.out.println("Step " + (i + 1) + " Inversions: " + stepInversions);
            System.out.println("Array after Step " + (i + 1) + ": " + Arrays.toString(arr));
        }

        System.out.println("Total Inversions: " + totalInversions);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
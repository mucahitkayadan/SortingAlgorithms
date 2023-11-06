import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {34, 8, 64, 51, 32, 21};
        int n = arr.length;
        int totalInversions = 0;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                // Swap elements
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;

                totalInversions++;
                System.out.println("Inversion: (" + arr[i] + ", " + arr[minIndex] + ")");
            }

            System.out.println("Step " + (i + 1) + " Inversions: " + totalInversions);
            System.out.println("Array after Step " + (i + 1) + ": " + Arrays.toString(arr));
        }

        System.out.println("Total Inversions: " + totalInversions);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
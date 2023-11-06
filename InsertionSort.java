import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {34, 8, 64, 51, 32, 21};
        int n = arr.length;
        int totalInversions = 0;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                System.out.println("Inversion: (" + arr[j] + ", " + key + ")");
                j--;
                totalInversions++;
            }

            arr[j + 1] = key;

            System.out.println("Step " + i + " Inversions: " + totalInversions);
            System.out.println("Array after Step " + i + ": " + Arrays.toString(arr));
        }

        System.out.println("Total Inversions: " + totalInversions);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
import java.util.Arrays;

public class ToySorter {
    public static void main(String[] args) {
        String[] toys = {"Blue", "Red", "Blue", "Red", "Blue", "Blue", "Red", "Red"};

        int left = 0;
        int right = toys.length - 1;

        while (left <= right) {
            if (toys[left].equals("Blue")) {
                left++;
            } else if (toys[right].equals("Red")) {
                right--;
            } else if (toys[left].equals("Red") && toys[right].equals("Blue")) {
                swap(toys, left, right);
                left++;
                right--;
            } else if (toys[left].equals("Red") && !toys[right].equals("Blue")) {
                right--;
            } else {
                left++;
            }
        }

        System.out.println("Sorted Toys: " + Arrays.toString(toys));
    }

    private static void swap(String[] toys, int i, int j) {
        String temp = toys[i];
        toys[i] = toys[j];
        toys[j] = temp;
    }
}
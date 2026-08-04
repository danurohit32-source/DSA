package Array;
import java.util.Scanner;

public class CheckSortedArray {

    // Method to check if array is sorted
    public static boolean isSorted(int[] arr) {

        // Traverse the array
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (isSorted(arr)) {
            System.out.println("Array is Sorted.");
        } else {
            System.out.println("Array is Not Sorted.");
        }

        sc.close();
    }
}

package Array;
import java.util.Scanner;

public class LargestElement {
    // Method to find the largest element
    public static int largest(int[] arr) {
        // Assume first element is the largest
        int max = arr[0];
        // Traverse the array
        for (int i = 1; i < arr.length; i++) {
            // Update max if a larger element is found
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
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

        System.out.println("Largest Element = " + largest(arr));
        sc.close();
    }
}
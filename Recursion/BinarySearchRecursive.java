
import java.util.Scanner;

public class BinarySearchRecursive {

    public static int binary(int[] arr, int key, int left, int right) {

        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;

        if (key == arr[mid]) {
            return mid;
        }

        if (key > arr[mid]) {
            return binary(arr, key, mid + 1, right);
        }

        return binary(arr, key, left, mid - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter sorted array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter key to search: ");
        int key = sc.nextInt();

        int result = binary(arr, key, 0, arr.length - 1);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}

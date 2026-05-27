
import java.util.Scanner;

public class Quicksort {

    public static void quicksort(int[] arr, int low, int high) {

        if (low < high) {

            int pivot = partition(arr, low, high);

            quicksort(arr, low, pivot - 1);
            quicksort(arr, pivot + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {

                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the " + n + " elements: ");

        for (int z = 0; z < n; z++) {
            arr[z] = sc.nextInt();
        }

        System.out.println("Array before sorting: ");

        for (int z = 0; z < n; z++) {

            if (z == n - 1) {
                System.out.print(arr[z]);
            } else {
                System.out.print(arr[z] + ", ");
            }
        }

        System.out.println();

        quicksort(arr, 0, n - 1);

        System.out.println("Array after sorting: ");

        for (int z = 0; z < n; z++) {

            if (z == n - 1) {
                System.out.print(arr[z]);
            } else {
                System.out.print(arr[z] + ", ");
            }
        }

        sc.close();
    }
}

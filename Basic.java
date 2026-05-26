
import java.util.Scanner;

class Basic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: " + n + "(no of elements)");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The array is: ");
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
        }

        int min = arr[0];
        int max = arr[0];

        if (n == 1) {
            System.out.println("Only 1 element, cant be compared");
        } else {
            for (int i = 0; i < n; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            System.out.println("Max number is: " + max + " & Min number is: " + min);
        }
    }
}

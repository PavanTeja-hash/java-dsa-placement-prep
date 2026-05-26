
import java.util.Scanner;

public class Insertionsort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        int minIndex = -1;

        System.out.println("Enter the number of elements of the array: ");
        int n = sc.nextInt();
        int nums[] = new int[n];

        System.out.println("Enter the " + n + " elements: ");
        for (int z = 0; z < n; z++) {
            nums[z] = sc.nextInt();
        }

        System.out.println("Array before sorting: ");
        for (int z = 0; z < n; z++) {
            if (z == n - 1) {
                System.out.print(nums[z]);
            } else {
                System.out.print(nums[z] + ", ");
            }
        }
        System.out.println();

        for (int i = 0; i < n - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }
            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
        System.out.println("Array after sorting: ");
        for (int z = 0; z < n; z++) {
            if (z == n - 1) {
                System.out.print(nums[z]);
            } else {
                System.out.print(nums[z] + ", ");
            }
        }

    }

}

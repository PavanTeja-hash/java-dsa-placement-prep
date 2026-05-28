
import java.util.Scanner;

public class MoveZeroes283 {

    public static void moveZeroes(int[] nums) {

        int i = 0;
        int j = 0;

        int size = nums.length;

        while (j < size) {

            if (nums[j] != 0) {

                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;

                i++;
            }

            j++;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the " + n + " elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Array before moving zeroes:");

        for (int i = 0; i < n; i++) {

            if (i == n - 1) {
                System.out.print(nums[i]);
            } else {
                System.out.print(nums[i] + ", ");
            }
        }

        System.out.println();

        moveZeroes(nums);

        System.out.println("Array after moving zeroes:");

        for (int i = 0; i < n; i++) {

            if (i == n - 1) {
                System.out.print(nums[i]);
            } else {
                System.out.print(nums[i] + ", ");
            }
        }

        System.out.println();
    }
}

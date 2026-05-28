
import java.util.Scanner;

public class SortedSquares977 {

    public static int[] sortedSquares(int[] nums) {

        int size = nums.length;

        int i = 0;
        int j = nums.length - 1;

        int[] rabbit = new int[size];
        int[] sqr = new int[size];

        int r = rabbit.length - 1;

        while (i <= j && r >= 0) {

            if (Math.abs(nums[i]) > Math.abs(nums[j])) {

                rabbit[r] = nums[i];
                i++;
                r--;

            } else {

                rabbit[r] = nums[j];
                j--;
                r--;
            }
        }

        for (int x = 0; x < size; x++) {
            sqr[x] = rabbit[x] * rabbit[x];
        }

        return sqr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the " + n + " sorted elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Array before squaring:");

        for (int i = 0; i < n; i++) {

            if (i == n - 1) {
                System.out.print(nums[i]);
            } else {
                System.out.print(nums[i] + ", ");
            }
        }

        System.out.println();

        int[] result = sortedSquares(nums);

        System.out.println("Sorted squares array:");

        for (int i = 0; i < result.length; i++) {

            if (i == result.length - 1) {
                System.out.print(result[i]);
            } else {
                System.out.print(result[i] + ", ");
            }
        }

        System.out.println();
    }
}

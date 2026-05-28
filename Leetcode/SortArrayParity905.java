
import java.util.Scanner;

public class SortArrayParity905 {

    public static int[] sortArrayByParity(int[] nums) {

        int size = nums.length;

        int[] sol = new int[size];

        int evenIndex = 0;
        int oddIndex = size - 1;

        for (int num : nums) {

            if (num % 2 == 0) {
                sol[evenIndex] = num;
                evenIndex++;
            } else {
                sol[oddIndex] = num;
                oddIndex--;
            }
        }

        return sol;
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

        System.out.println("Array before sorting by parity:");

        for (int i = 0; i < n; i++) {

            if (i == n - 1) {
                System.out.print(nums[i]);
            } else {
                System.out.print(nums[i] + ", ");
            }
        }

        System.out.println();

        int[] result = sortArrayByParity(nums);

        System.out.println("Array after sorting by parity:");

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

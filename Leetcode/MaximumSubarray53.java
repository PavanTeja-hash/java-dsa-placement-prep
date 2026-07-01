
import java.util.Scanner;

public class MaximumSubarray53 {

    public static int maxSubArray(int[] nums) {

        int currentSum = 0;
        int maxSum = nums[0];

        for (int i = 0; i < nums.length; i++) {

            currentSum += nums[i];

            maxSum = Math.max(maxSum, currentSum);

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
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

        System.out.print("Array: ");

        for (int i = 0; i < n; i++) {

            if (i == n - 1) {
                System.out.print(nums[i]);
            } else {
                System.out.print(nums[i] + ", ");
            }
        }

        System.out.println();

        int answer = maxSubArray(nums);

        System.out.println("Maximum Subarray Sum = " + answer);

        sc.close();
    }
}

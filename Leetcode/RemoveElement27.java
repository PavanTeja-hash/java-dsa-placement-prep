
import java.util.Scanner;

public class RemoveElement27 {

    public static int removeElement(int[] nums, int val) {

        int i = 0;
        int j = 0;

        while (j < nums.length) {

            if (nums[j] != val) {

                nums[i] = nums[j];
                i++;
                j++;
            } else {

                j++;
            }
        }

        return i;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter value to remove: ");
        int val = sc.nextInt();

        int k = removeElement(nums, val);

        System.out.println("Number of remaining elements: " + k);

        System.out.print("Modified array: ");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}


import java.util.Scanner;

public class RemoveDuplicates26 {

    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int i = 0;
        int j = 1;

        while (j < nums.length) {

            if (nums[j] != nums[i]) {

                nums[i + 1] = nums[j];
                i++;
            }

            j++;
        }

        return i + 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter sorted array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);

        System.out.print("Array after removing duplicates: ");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}

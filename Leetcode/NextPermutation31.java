
import java.util.Scanner;

public class NextPermutation31 {

    public static void nextPermutation(int[] nums) {

        int pivot = -1;

        for (int i = nums.length - 2; i >= 0; i--) {

            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        if (pivot == -1) {

            int i = 0;
            int j = nums.length - 1;

            while (i < j) {

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i++;
                j--;
            }

            return;
        }

        for (int i = nums.length - 1; i > pivot; i--) {

            if (nums[i] > nums[pivot]) {

                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;

                break;
            }
        }

        int i = pivot + 1;
        int j = nums.length - 1;

        while (i < j) {

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        nextPermutation(nums);

        System.out.println("Next Permutation:");

        for (int num : nums) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}

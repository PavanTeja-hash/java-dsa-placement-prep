
import java.util.Scanner;

public class BinarySearch704 {

    public static int search(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the " + n + " sorted elements: ");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter target element: ");
        int target = sc.nextInt();

        int result = search(nums, target);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }

        sc.close();
    }
}

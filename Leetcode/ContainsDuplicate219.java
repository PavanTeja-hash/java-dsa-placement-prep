
import java.util.HashMap;
import java.util.Scanner;

public class ContainsDuplicate219 {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            } else {

                int previousIndex = map.get(nums[i]);
                int dist = i - previousIndex;

                map.put(nums[i], i);

                if (dist <= k) {
                    return true;
                }
            }
        }

        return false;
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

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        boolean result = containsNearbyDuplicate(nums, k);

        System.out.println("Contains Nearby Duplicate: " + result);

        sc.close();
    }
}


import java.util.Scanner;

public class TwoSumII167 {

    public static int[] twoSum(int[] numbers, int target) {

        int[] result = new int[2];

        int i = 0;
        int j = numbers.length - 1;

        while (i < j) {

            int sum = numbers[i] + numbers[j];

            if (sum > target) {
                j--;
            } else if (sum < target) {
                i++;
            } else {

                result[0] = i + 1;
                result[1] = j + 1;

                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter sorted array elements:");

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Enter target:");
        int target = sc.nextInt();

        int[] result = twoSum(numbers, target);

        System.out.println("Indices (1-based): " + result[0] + " " + result[1]);
    }
}

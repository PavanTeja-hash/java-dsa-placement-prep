
import java.util.Scanner;

public class ContainerWithMostWater11 {

    public static int maxArea(int[] height) {

        int i = 0;
        int j = height.length - 1;

        int maxCapacity = 0;

        while (i < j) {

            int width = j - i;

            int minHeight = Math.min(height[i], height[j]);

            int capacity = width * minHeight;

            maxCapacity = Math.max(capacity, maxCapacity);

            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return maxCapacity;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of heights:");
        int n = sc.nextInt();

        int[] height = new int[n];

        System.out.println("Enter the heights:");

        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }

        System.out.println("Height array:");

        for (int i = 0; i < n; i++) {

            if (i == n - 1) {
                System.out.print(height[i]);
            } else {
                System.out.print(height[i] + ", ");
            }
        }

        System.out.println();

        int result = maxArea(height);

        System.out.println("Maximum water that can be stored: " + result);
    }
}

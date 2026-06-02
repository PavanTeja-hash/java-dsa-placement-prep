
import java.util.Scanner;

public class ReverseString {

    public static void reverse(char[] arr, int left, int right) {

        if (left >= right) {
            return;
        }

        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        reverse(arr, left + 1, right - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        char[] arr = s.toCharArray();

        reverse(arr, 0, arr.length - 1);

        System.out.println("Reversed String: " + new String(arr));

        sc.close();
    }
}

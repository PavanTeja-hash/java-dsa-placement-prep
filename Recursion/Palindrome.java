
import java.util.Scanner;

public class Palindrome {

    public static boolean pal(String s, int left, int right) {

        if (left >= right) {
            return true;
        }

        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }

        return pal(s, left + 1, right - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        boolean result = pal(s, 0, s.length() - 1);

        System.out.println("Palindrome: " + result);

        sc.close();
    }
}

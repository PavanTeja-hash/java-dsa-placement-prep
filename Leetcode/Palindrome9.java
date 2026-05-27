
import java.util.Scanner;

public class Palindrome9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int reverse = 0;

        if (num < 0) {
            System.out.println("Negative numbers can't be palindromes");
            return;
        }

        while (num != 0) {
            int digit = num % 10;
            num = num / 10;
            reverse = reverse * 10 + digit;
        }

        if (reverse == original) {
            System.out.println("The number is a palindrome");
        } else {
            System.out.print("The number is not a palindrome");
        }

    }
}

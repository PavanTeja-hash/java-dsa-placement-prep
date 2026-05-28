
import java.util.Scanner;

public class ValidAnagram242 {

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] frq = new int[26];

        for (int i = 0; i < s.length(); i++) {

            char c1 = s.charAt(i);
            frq[c1 - 'a']++;

            char c2 = t.charAt(i);
            frq[c2 - 'a']--;
        }

        for (int value : frq) {

            if (value != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String s = sc.nextLine();

        System.out.println("Enter second string:");
        String t = sc.nextLine();

        boolean result = isAnagram(s, t);

        if (result) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}

import java.util.Scanner;

public class NumberOfSubstrings1358 {

    public static int numberOfSubstrings(String s) {

        int left = 0;
        int ans = 0;
        int[] freq = new int[3];

        for (int right = 0; right < s.length(); right++) {

            // Add current character to the window
            freq[s.charAt(right) - 'a']++;

            // Shrink the window while it contains a, b and c
            while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {

                // Every substring ending from right to end is valid
                ans += s.length() - right;

                // Remove leftmost character
                freq[s.charAt(left) - 'a']--;

                left++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.next();

        int result = numberOfSubstrings(s);

        System.out.println("Number of Valid Substrings: " + result);

        sc.close();
    }
}
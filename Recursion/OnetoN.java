
import java.util.Scanner;

public class OnetoN {

    public static void oneton(int n) {

        if (n == 0) {
            return;
        }

        oneton(n - 1);

        System.out.println(n);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N value: ");
        int n = sc.nextInt();

        oneton(n);

        sc.close();
    }
}

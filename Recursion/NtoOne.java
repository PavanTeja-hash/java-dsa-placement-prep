
import java.util.Scanner;

public class NtoOne {

    public static void ntoone(int n) {

        if (n == 0) {
            return;
        }

        System.out.println(n);

        ntoone(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N value: ");
        int n = sc.nextInt();

        ntoone(n);

        sc.close();
    }
}

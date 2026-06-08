
import java.util.ArrayList;
import java.util.Scanner;

public class PascalsTriangle118 {

    public static ArrayList<ArrayList<Integer>> generate(int numRows) {

        ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

            ArrayList<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i) {
                    row.add(1);
                } else {

                    int value = triangle.get(i - 1).get(j - 1)
                            + triangle.get(i - 1).get(j);

                    row.add(value);
                }
            }

            triangle.add(row);
        }

        return triangle;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int numRows = sc.nextInt();

        ArrayList<ArrayList<Integer>> result = generate(numRows);

        System.out.println("\nPascal's Triangle:");

        for (ArrayList<Integer> row : result) {
            System.out.println(row);
        }

        sc.close();
    }
}

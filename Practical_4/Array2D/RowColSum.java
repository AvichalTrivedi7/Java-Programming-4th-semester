package Array2D;
import java.util.*;

public class RowColSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int r = sc.nextInt();
        System.out.print("Enter cols: ");
        int c = sc.nextInt();

        int[][] mat = new int[r][c];
        System.out.println("Enter elements:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                mat[i][j] = sc.nextInt();

        for (int i = 0; i < r; i++) {
            int rowSum = 0;
            for (int j = 0; j < c; j++)
                rowSum += mat[i][j];
            System.out.println("Sum of row " + i + ": " + rowSum);
        }

        for (int j = 0; j < c; j++) {
            int colSum = 0;
            for (int i = 0; i < r; i++)
                colSum += mat[i][j];
            System.out.println("Sum of col " + j + ": " + colSum);
        }
    }
}
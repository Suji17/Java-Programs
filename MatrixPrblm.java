import java.util.Scanner;

public class MatrixPrblm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rows:");
        int rows = sc.nextInt();
        System.out.println("Cols");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];

        System.out.println("enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int choice;
        do {
            System.out.println("\n----Matrix Menu----");
            System.out.println("1.Transpose of matrix");
        } while (true);

    }
}

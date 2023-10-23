
//Add two matrix
import java.util.*;

public class Q2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int matrixA[][] = new int[3][3];
        int matrixB[][] = new int[3][3];
        int sum[][] = new int[3][3];
        int i, j;
        System.out.print("Enter the matrix A=");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                matrixA[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the matrix B=");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                matrixB[i][j] = sc.nextInt();
            }
        }
        System.out.print("Sum of matrixA or MatrixB\n");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {

                sum[i][j] = matrixA[i][j] + matrixB[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();

        }

    }
}

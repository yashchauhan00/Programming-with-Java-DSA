
//multiplication  two matrix
import java.security.KeyFactory;
import java.util.*;

public class Q3 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int matrixA[][] = new int[3][3];
        int matrixB[][] = new int[3][3];
        int multi[][] = new int[3][3];
        int i, j, k;
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
        System.out.print("multiplication of matrixA or MatrixB :\n");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                {
                    for (k = 0; k < 3; k++) {
                        multi[i][j] = matrixA[i][k] * matrixB[k][j];
                    }

                }
            }
        }
        System.out.print("Enter the matrix B=");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(multi[i][j] + " ");
            }
            System.out.println();
        }
    }
}

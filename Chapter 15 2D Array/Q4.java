
//transpose of matrix
import java.util.*;

public class Q4 {

    public static void main(String args[]) {
        int matrix[][] = new int[3][3];
        System.out.print("Enter the martix A=");
        Scanner sc = new Scanner(System.in);
        {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            System.out.print("Simple Matrix :\n");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
            System.out.print("Transpose of matrix of :=\n");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matrix[j][i] + " ");
                }
                System.out.println();
            }
        }
    }
}

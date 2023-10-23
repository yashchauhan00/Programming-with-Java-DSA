
//sum array
import java.util.*;

public class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n[] = new int[5];
        int sum = 0;
        System.out.print("Enter the array=");
        for (int i = 0; i < 5; i++) {
            n[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            sum = sum + n[i];
            // System.out.print(+sum);
        }
        System.out.print("Sum of array=" + sum);
    }

}

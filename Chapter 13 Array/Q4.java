
//largest array
import java.util.*;

public class Q4 {

    public static void main(String args[]) {
        int size, max, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size=");
        size = sc.nextInt();
        int n[] = new int[size];
        System.out.print("Enter the array=");
        for (i = 0; i < size; i++) {
            n[i] = sc.nextInt();
        }
        max = n[0];
        for (i = 0; i < size; i++) {
            if (n[i] > max) {
                max = n[i];
            }
        }
        System.out.print("maxmimum array=" + max);
    }
}

//Maximum of array
import java.util.*;

public class Q3 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n[] = new int[5];
        System.out.print("Enter the array=");
        for (int i = 0; i < 5; i++) {
            n[i] = sc.nextInt();
        }
        int num = n[0];
        for (int i = 0; i < 5; i++) {
            if (num <= n[i]) {
                break;
            }
        }
        System.out.print("Largest no of array=" + num);
    }
}

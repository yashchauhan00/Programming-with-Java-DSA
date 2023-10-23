
//count the number if occurrences of a particular element X.
import java.util.*;

public class Q7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n[] = new int[5];
        int count = 0;
        System.out.print("Enter the array=");
        for (int i = 0; i < 5; i++) {
            n[i] = sc.nextInt();
        }
        System.out.print("Enter the array count occurrences=");
        int x = sc.nextInt();
        for (int i = 0; i < 5; i++) {
            if (n[i] == x) {
                count++;
            }
        }
        System.out.print("count the repeated number=" + count);
    }
}

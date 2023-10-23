
//Revers Array
import java.util.*;

public class Q6 {

    public static void main(String args[]) {
        int num[] = { 2, 4, 6, 8, 10 };
        int start = 0, i;
        int end = num.length - 1;
        while (start < end) {
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;

            start++;
            end--;
        }
        for (i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

    }
}
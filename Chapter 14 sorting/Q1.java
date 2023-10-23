
//Bubble sort
import java.util.*;

public class Q1 {

    public static void main(String args[]) {
        int num[] = { 10, 7, 6, 5, 4, 3, 2, 1 };
        int i;
        for (i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - 1 - i; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
        System.out.print("Sorting the array :\n");
        for (i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }

}

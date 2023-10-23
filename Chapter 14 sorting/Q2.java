
//Selection sort
import java.util.*;

public class Q2 {

    public static void main(String args[]) {
        int arr[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int i, j;
        for (i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.print("Sorted array :\n");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}

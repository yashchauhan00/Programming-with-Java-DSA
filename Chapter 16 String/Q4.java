import java.util.*;

public class Q4 {

    public static void main(String args[]) {
        int i, j, flag;
        String s = new String();
        System.out.print("Enter the string=");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        i = 0;
        j = s.length() - 1;
        flag = 0;
        while (i < j && flag == 0) {
            if (s.charAt(i) != s.charAt(j)) {
                flag = 1;
                i++;
                j--;
            }
        }
        if (flag == 1) {
            System.out.print("Not Palindrome");
        } else {
            System.out.print("palindrome");
        }
    }
}

import java.util.*;

public class Q6 {
    public static void main(String args[]) {
        String s = new String();
        int i, word = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string=");
        s = sc.nextLine();
        for (i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                word++;
            }
        }
        System.out.print(+word);

    }
}
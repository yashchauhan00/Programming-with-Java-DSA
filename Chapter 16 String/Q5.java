import java.util.*;

public class Q5 {
    public static void main(String args[]) {
        String s = new String();
        int i, vol = 0, con = 0;
        System.out.print("Enter the string =");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        s = s.toUpperCase();
        for (i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    vol++;
                } else {
                    con++;
                }
            }
        }
        System.out.print("vowels=" + vol + "cons=" + con);
    }
}

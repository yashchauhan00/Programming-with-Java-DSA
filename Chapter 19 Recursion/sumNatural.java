import java.util.*;

public class sumNatural {
    public static void main(String[] args) {
        int n, ans;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find natural =");
        n = sc.nextInt();
        ans = sum(n);
        System.out.println("sum of natrual number = " + ans);
    }

    public static int sum(int n) {
        int f;
        if (n == 1) {
            return 1;
        } else {
            f = n + sum(n - 1);
            return f;
        }
    }
}

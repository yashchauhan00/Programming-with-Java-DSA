import java.util.*;

public class factorialrec {
    public static void main(String[] args) {
        int n, ans;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find factorial=");
        n = sc.nextInt();
        ans = factorial(n);
        System.out.println("Factorial = " + ans);
    }

    public static int factorial(int n) {
        int f;
        if (n == 1) {
            return 1;
        } else {
            f = n * factorial(n - 1);
            return f;
        }
    }
}
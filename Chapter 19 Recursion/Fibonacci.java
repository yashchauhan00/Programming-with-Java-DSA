import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("0");
        System.out.println("1");
        fibonacci(n - 2);
    }

    public static void fibonacci(int n) {
        int n1 = 0, n2 = 1, n3;
        while (n > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(n3);
            n--;
        }
    }
}

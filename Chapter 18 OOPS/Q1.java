import java.util.*;

class Q1 {
    int a, b;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first  number=");
        a = sc.nextInt();
        System.out.print("Enter second number=");
        b = sc.nextInt();
    }

    void putdata() {
        System.out.println("Addtion=" + (a + b));
    }

    public static void main(String args[]) {
        Q1 aa = new Q1();
        aa.getdata();
        aa.putdata();
    }
}

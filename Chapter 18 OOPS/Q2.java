import java.util.*;

class A {
    int a, b;

    void inputdata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers=");
        a = sc.nextInt();
        b = sc.nextInt();
    }
}

class B extends A {
    int c;

    void getdata() {
        c = a + b;
        System.out.print("sum=" + c);
    }
}

public class Q2 {

    public static void main(String args[]) {
        B aa = new B();
        aa.inputdata();
        aa.getdata();
    }
}

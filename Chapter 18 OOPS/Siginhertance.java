import java.util.*;

class A {
    int a, b;

    void inputdata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number A=");
        a = sc.nextInt();
        System.out.print("Enter the nubmer B=");
        b = sc.nextInt();
    }
}

class B extends A {
    int c;

    void getdata() {
        c = a + b;
        System.out.print("sum Two number C=" + c);
    }
}

public class Siginhertance {

    public static void main(String args[]) {
        B aa = new B();
        aa.inputdata();
        aa.getdata();
    }
}

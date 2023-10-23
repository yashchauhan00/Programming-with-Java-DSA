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
        System.out.println("sum Two number C=" + c);
    }
}

class c extends B {
    int d;

    void outputdata() {
        d = c * c;
        System.out.println("Square of sum =" + d);
    }

}

public class multInhertance {

    public static void main(String args[]) {
        c aa = new c();
        aa.inputdata();
        aa.getdata();
        aa.outputdata();

    }
}
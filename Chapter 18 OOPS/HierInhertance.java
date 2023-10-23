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

class C extends A {
    int d;

    void outputdata() {
        d = a - b;
        System.out.println("sub Two number d=" + d);
    }

}

public class HierInhertance {

    public static void main(String args[]) {
        B aa = new B();
        aa.inputdata();
        aa.getdata();
        C bb = new C();
        bb.inputdata();
        bb.outputdata();

    }
}

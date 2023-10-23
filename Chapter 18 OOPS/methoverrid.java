import java.util.*;

class A {
    void display() {
        System.out.print("Base class");
    }
}

class B extends A {
    void display() {
        System.out.print("Drived class");
    }
}

public class methoverrid {
    public static void main(String args[]) {
        B aa = new B();
        aa.display();

    }
}

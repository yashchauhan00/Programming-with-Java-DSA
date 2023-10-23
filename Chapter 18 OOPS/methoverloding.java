import java.util.*;

class add {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

public class methoverloding {

    public static void main(String args[]) {
        add sc = new add();
        System.out.println(sc.sum(1, 2));
        System.out.println(sc.sum((float) 1.1, (float) 1.1));
        System.out.println(sc.sum(2, 2, 2));
    }
}
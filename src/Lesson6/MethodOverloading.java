package Lesson6;

public class MethodOverloading {
    void show(int i) {
        System.out.println(i);
    }

    void show(boolean bi) {
        System.out.println(bi);
    }

    void show(String s) {
        System.out.println(s);
    }
}

class MethodOverloadingTest {
    public static void main(String[] args) {
        MethodOverloading mt = new MethodOverloading();
        int a = 500;
        boolean b = true;
        String s = "Hello";

        mt.show(a);
        mt.show(b);
        mt.show(s);
    }
}

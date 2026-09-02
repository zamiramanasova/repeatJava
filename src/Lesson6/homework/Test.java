package Lesson6.homework;

public class Test {

    void sum() {
        System.out.println("Nothing");
    }
    int sum(int a) {
        return a;
    }
    int sum(int a, int b) {
        return a + b;
    }
    int sum(int a, int b, int c) {
        return a + b + c;
    }
    int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}

class Main{
    public static void main(String[] args) {
        Test t = new Test();
        t.sum();
        System.out.println(t.sum(1));
        System.out.println(t.sum(1,2));
        System.out.println(t.sum(1,2,3));
        System.out.println(t.sum(1,2,3,4));
    }
}

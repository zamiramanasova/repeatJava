package Lesson8;

public class Test1 {
    public final int a = 10;

    public void abc(final short s) {
        final byte b;
        b = 10;
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        Test1 t1 = new Test1();
        System.out.println(t1.a);
    }
}

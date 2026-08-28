package Lesson6;

public class Main {

    int sum(int i1, int i2) {
        return i1 + i2;
    }
    String sum(String s1, String s2) {
        return  s1 + s2;
    }
}

class MainTest {
    public static void main(String[] args) {
        Main m = new Main();
        int a = m.sum(5,7);
        System.out.println(a);
        String s = m.sum("Hi", "Bye");
        System.out.println(s);
    }
}

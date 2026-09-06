package Lesson19;

public class Varargs {
    static void summa(int ... a) {
        int summa = 0;
        for (int i = 0; i < a.length; i++) {
            summa += a[i];
        }
        System.out.println(summa);
    }

    public static void abc(int b) {
        System.out.println("Hello");
    }

    public static void abc(int ... b) {
        System.out.println("Bye");
    }

    public static void main(String[] args) {
        summa(3,5);
        summa(new int[] {1,2,3});
        abc(5);
    }
}

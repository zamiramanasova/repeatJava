package Lesson14;

public class Test1 {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i ++) {
            System.out.println(i);
        }
        for (int i = 1, j = 10; i < 11 && i> -3 || i > 4; i++, j=j+20) {
            System.out.println(i);
        }
        //    1          2       3       4 вывод метода производится по порядку
        for (int i = 5; i < 11; i++,abc(10)) {
            System.out.println(i);
        }

        for (int i = 1; i < 11; ) {
            System.out.println(i);
            i++;
        }
        //бесконечный цикл
        for (int i = 1; i < 11; ) {
            System.out.println(i);
        }

        for (int i = 1; ; i++ ) {
            System.out.println(i);
        }

    }

    static void abc(int n) {
        System.out.println(n);
    }
}

package Lesson14.homework;

public class Test {

    public static void hour() {
        OUTER:
        for (int hour1 = 0; hour1 < 6; hour1++) {
            MIDDLE:
            for (int minute1 = 0; minute1 < 60; minute1++) {
                if (hour1 > 1 && minute1 % 10 == 0) {
                    break OUTER;
                }
                INNER:
                for (int second1 = 0; second1 < 60; second1++) {
                    if (second1 * hour1 > minute1) {
                        continue MIDDLE;
                    }
                    System.out.println(hour1 + ":" + minute1 + ":" + second1);
                }
            }
        }
    }

    public static void main(String[] args) {
        hour();
    }
}

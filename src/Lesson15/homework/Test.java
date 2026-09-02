package Lesson15.homework;

/**
 * Переписать домашнее задание так
 * чтобы outer inner циклы представляли собой while loop,
 * а middle цикл представлял собой do while loop
 */
public class Test {
    public static void secondHour() {
        int hour = 0;

        OUTER:
        while (hour < 6) {
            int minuta = -1;// когда он перейдет в do while станет 0.

            MIDDLE:
            do {
                minuta++;// почему стоит здесь, при начале цикла минута увелич. на 1
                // если бы стояло в конце то был бы бесконечный цикл
                if (hour > 1 && minuta % 10 == 0) {
                    break OUTER;
                }
                int second = 0;
                INNER:
                while (second < 60) {
                    if (second * hour > minuta) {
                        continue MIDDLE;
                    }
                    System.out.println(hour + ":" + minuta + ":" + second);
                    second++;
                }

            } while (minuta < 59);
            hour++;
        }
    }

        public static void main(String[] args) {
           secondHour();
        }
    }


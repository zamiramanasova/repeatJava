package Lesson15;

public class Test6 {
    public static void main(String[] args) {
        for (int chas = 0; chas<24; chas++) {
            int minuta = 0;
            while (minuta < 60) {
                System.out.println(chas + ":" + minuta);
                minuta++;
            }
        }
    }
}

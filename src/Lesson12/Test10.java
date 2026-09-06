package Lesson12;

public class Test10 {
    public static void main(String[] args) {
        int salary = 1500;

        if (salary < 200) {
            System.out.println("zp ochen nizkaya");
        } else if (salary < 400) {
            System.out.println("zp srednego razmera");
        } else if (salary < 600) {
            System.out.println("zp visokaya");
        }

        int a = 10;
        int b = 20;
        int maximum = (a>b) ? a : b;
        System.out.println(maximum);
    }
}

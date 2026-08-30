package Lesson8.homework;

import static Lesson8.homework.SecondTest.countCircle;

public class SecondTest {
    static final double PI = 3.14;

    public double sumArea(double radius) {
        double area = PI * radius * radius;
        return area;
    }

    public static double countCircle(double radius) {
        double area = 2 * PI * radius;
        return area;
    }

    public void countCrug(double radius) {
        System.out.println("Radius: " + radius);
        System.out.println("Ploshad : " + sumArea(radius));
        System.out.println("Dlina okrujnosti : " + countCircle(radius));
    }
}

class MainSecondTest {
    public static void main(String[] args) {
        SecondTest st = new SecondTest();
        st.sumArea(5);
        System.out.println(countCircle(7.5));
        st.countCrug(3);
    }
}

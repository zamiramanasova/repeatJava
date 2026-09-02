package Lesson8.homework;

public class Test {
    public static int count(int a, int b, int c) {
        int sum = a * b * c;
        return sum;
    }

    public static void countMinus(int a, int b) {
        System.out.println("Count minus is: " + a/b + " ostatok : " + a%b);
    }
}

class MainTest {
    public static void main(String[] args) {
        System.out.println(Test.count(5,5,5));
        System.out.println(Test.count(3,4,5));
        Test.countMinus(15,5);
        Test.countMinus(16,4);
        System.out.println(Test.count(6,6,6));
        System.out.println(Test.count(1,2,3));
        Test.countMinus(160,10);
        Test.countMinus(13,5);
    }
}

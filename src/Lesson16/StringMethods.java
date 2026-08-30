package Lesson16;

public class StringMethods {
    public static void main(String[] args) {
        String s1 = new String("privet");

        int a = s1.length();
        System.out.println(a);

        char c1 = s1.charAt(3);// выводит символ под индексом 3
        System.out.println(c1);


        String s2 = s1.substring(3);
        System.out.println(s2);
        System.out.println(s1);

    }
}

package Lesson17.homework;

public class Test {
    public static boolean ravenstvo(StringBuilder s1, StringBuilder s2) {
        boolean result = true;
        if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("hello");
        StringBuilder s2 = new StringBuilder("hello");
        StringBuilder s3 = new StringBuilder("Hello");
        boolean a = Test.ravenstvo(s1,s2);// приравнивание к boolean
        System.out.println(a);// true значения равны
        System.out.println(Test.ravenstvo(s2, s3));// false
        System.out.println(Test.ravenstvo(new StringBuilder(""), new StringBuilder("")));// true но мы к ним потом обратиться не сможем
        // потому что нет переменной которая ссылается на эти объекты.
        System.out.println(Test.ravenstvo(new StringBuilder(), new StringBuilder()));// true но мы к ним потом так же обратиться не сможем
        // потому что нет переменной которая ссылается на эти объекты.
    }
}

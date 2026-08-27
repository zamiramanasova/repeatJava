public class Lesson3 {

    public static void main(String[] args) {

//        int x = 5;
//        int y = 3;
//        int z = x - y++;
//        System.out.println(z);
//        System.out.println(y);
//
//        int a = 5;
//        int b = 3;
//        int c = a - ++b;
//        System.out.println(z);
//        System.out.println(b);

        double d = 1.3;
        int i = 5;
        double result = 0;
        result = 1.3 % 5;
        System.out.println(result);

        int q = 5;
        int w = 8;
        int res = q-- - --q + ++q + q++ + q;
        System.out.println(res);
        int wer = ++w - w++ + ++w - --w;
        System.out.println(wer);
    }
}

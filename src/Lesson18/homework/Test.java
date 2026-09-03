package Lesson18.homework;

import java.util.Arrays;

public class Test {
    public static void sotirovka(int [] a) {
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {2,4,0,1,5};
        sotirovka(array);
    }
}

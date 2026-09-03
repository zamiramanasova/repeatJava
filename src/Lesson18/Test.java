package Lesson18;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        array[1] = 4;
        System.out.println(array[1]);

        int [] a = {1,2,3,4};
        int index = Arrays.binarySearch(a, 5);
        System.out.println(index);
        System.out.println(a.toString());
    }
}

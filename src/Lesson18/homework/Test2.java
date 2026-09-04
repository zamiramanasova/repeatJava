package Lesson18.homework;

public class Test2 {
    public static void showArray(String [][] arrays) {//когда идет многомерный массив всегда исп. nested loop
        System.out.println("{  ");
        for (int i = 0; i < arrays.length; i++) {
            System.out.println("{");
            for (int j = 0; j < arrays[i].length; j++) {
                if (j != arrays[i].length - 1) {
                    System.out.println(arrays[i][j] + ", ");
                } else {
                    System.out.println(arrays[i][j]);
                }
            }
            if (i != arrays.length - 1) {
                System.out.println("j, ");
            } else {
                System.out.println("j");
            }
        }
        System.out.println("  }");
    }

    public static void main(String[] args) {
        String [][] array = {{"apple", "orange"},{"hello", "bye", "ok"},{"car"}};
        showArray(array);
        showArray(new String[][]{{"man", "woman"}, {"male","female"}});
    }
}

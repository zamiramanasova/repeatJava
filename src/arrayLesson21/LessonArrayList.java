package arrayLesson21;

import java.util.ArrayList;

public class LessonArrayList {
    public static void main(String[] args) {

        int a =1;

        ArrayList <StringBuilder> list = new ArrayList<>();
        StringBuilder s1 = new StringBuilder("hello");
        StringBuilder s2 = new StringBuilder("ok");
        StringBuilder s3 = new StringBuilder("privet");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        for (int i = 0; i < list.size(); i++) {
            list.get(i).append("!!!"); // добавляет любое значение
        }
        for (StringBuilder sb: list) {
            System.out.print(sb + " ");
        }

    }
}

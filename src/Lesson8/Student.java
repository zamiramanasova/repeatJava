package Lesson8;

import static Lesson8.Student.showCount;

public class Student {
    String name;
    int course;
    static int count;
    int a;

    public Student(String name1, int course1) {
        count++;
        name = name1;
        course = course1;
        System.out.println("Studetn : " + count + " sozdan.");
    }
    public static void showCount() {
        System.out.println("Vsego sozdano studentov : " + count);
    }
    public void showInfo() {
        System.out.println("Welcome to the Student class!!");
    }

    void abc() {
        a++;
        count++;
    }

    static void abcd() {
        count++;
        Student st1 = new Student("Petr",1);
        st1.a++;
    }

    public static void main(String[] args) {
        abcd();
        Student st2 = new Student("Ivan", 4);
        st2.abc();
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("Bob", 1);
        Student s2 = new Student("Dob", 2);
        Student s3 = new Student("Rob", 3);

        System.out.println(s1.name);
        System.out.println(Student.count);
        showCount();
    }
}

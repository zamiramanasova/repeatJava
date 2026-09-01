package Lesson12.homework;

import Lesson11.Student;

public class StudentTest {

    public static void equalsStudents(Student s1, Student s2) {
        if (s1.name.equals(s2.name) && s1.course == s2.course && s1.grade == s2.grade) {
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }
    }

    public static void equalsAttributeStudents(Student s1, Student s2) {
        if (s1.name.equals(s2.name)) {
            if (s1.course == s2.course) {
                if (s1.grade == s2.grade) {
                    System.out.println("Everything same");
                } else {
                    System.out.println("Names are the same but grades are different");
                }
            } else {
                System.out.println("Names are the same but courses are different");
            }
        } else {
            System.out.println("The names are different");
        }
    }

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 3, 9.5);
        Student st2 = new Student("Ivan", 3, 5.3);

        equalsStudents(st1, st2);
        equalsAttributeStudents(st1, st2);
    }
}

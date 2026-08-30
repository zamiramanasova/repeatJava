package Lesson6.homework;

public class Student {
    int id;
    String name;
    String surname;
    String course;
    int year;
    double numberMath;
    double numberEconomic;
    double numberEnglish;

    Student(int id1, String name1, String surname1, String course1, int year1, double numberMath1, double numberEconomic1, double numberEnglish1) {
        id = id1;
        name = name1;
        surname = surname1;
        course = course1;
        year = year1;
        numberMath = numberMath1;
        numberEconomic = numberEconomic1;
        numberEnglish = numberEnglish1;
    }

    Student(int id2, String name2, String surname2, String course2){
        this(id2,name2,surname2,course2, 0,0.0,0.0,0.0);
    }

    Student() {}
}

class StudentMain{
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1);
        Student s2 = new Student(1, "Zaur","Zaurovich", "IT");
        System.out.println(s2.id + " " + s2.name + " " + s2.surname + " " + s2.course);
        Student s3 = new Student(2, "Bomba", "Bombovich", "IT",1998,5.0,5.0,4.0);
        System.out.println(s3.id + " " + s3.name + " " + s3.surname + " " + s3.course + " " + s3.year + " " + s3.numberMath + " " +
                s3.numberEconomic + " " + s3.numberEnglish);
    }
}

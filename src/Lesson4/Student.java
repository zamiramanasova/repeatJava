package Lesson4;

public class Student {
    int id;
    String name;
    String surname;
    int year;
    double numberMath;
    double numberEconomic;
    double numberEnglish;

    public Student(int id, String name, String surname, int year, double numberMath, double numberEconomic, double numberEnglish) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.numberMath = numberMath;
        this.numberEconomic = numberEconomic;
        this.numberEnglish = numberEnglish;
    }

    void count() {
        double sum = (numberMath + numberEconomic + numberEnglish) / 3;
        System.out.println(name + " : " + sum);
    }
}

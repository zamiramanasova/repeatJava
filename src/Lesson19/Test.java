package Lesson19;

public class Test {
    public static void main(String[] args) {
        String[] students = {"Ivanov,","Petrov","Sidorov"};
        String[] exams = {"mat analiz", "filosofiya"};
        for (String s : students) {
            for (String s2 : exams) {
                System.out.println(s + " " + s2);
            }
        }
    }
}

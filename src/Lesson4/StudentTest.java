package Lesson4;

public class StudentTest {
    public static void main(String[] args) {

        Student student1 = new Student(1,"Mark","Markov",
                1989,4.0,3.5,5.0);
        Student student2 = new Student(2,"Bova","Bovych",
                1989,5.0,4.5,4.0);
        Student student3 = new Student(3,"Berk","Berkov",
                1989,3.0,4.0,4.5);

        student1.count();
        student2.count();
        student3.count();

    }
}

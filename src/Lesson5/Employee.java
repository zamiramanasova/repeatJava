package Lesson5;

public class Employee {

    int id;
    String surname;
    int age;
    int salary;
    String department;

    public Employee(int id, String surname, int age, int salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    void secondSalary() {
        int sum = salary + salary;
        System.out.println("Employee : " + salary + " but now is : " + sum);
    }
}

class EmployeeTest {
    public static void main(String[] args) {

        Employee em1 = new Employee(1, "Person1", 23, 900, "RTD");
        Employee em2 = new Employee(2, "Person2", 24, 890, "WER");
        em1.secondSalary();
        em2.secondSalary();
    }
}
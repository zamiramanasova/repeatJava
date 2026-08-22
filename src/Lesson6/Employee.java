package Lesson6;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    Employee(int id1, String surname1, int age1) {
        this(surname1, age1);
        id = id1;
    }
    Employee(String surname2, int age2) {
        surname = surname2;
        age = age2;
    }
    Employee(int id3, String surname3, int age3, double salary3, String department3) {
        this(id3, surname3, age3);
        salary = salary3;
        department = department3;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "Bugibugi", 23);
        System.out.println(emp.surname);
        Employee emp2 = new Employee("Petrov", 30);
        System.out.println(emp2.department);
        Employee emp3 = new Employee(2, "Romich", 34,340000,"Google");
        System.out.println(emp3.department);
    }
}

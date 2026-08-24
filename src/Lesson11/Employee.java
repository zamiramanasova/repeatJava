package Lesson11;

public class Employee {
    public String name;
    public double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public double uvelichenie(double a) {
        a = a * 2;
        return a;
    }
    public double zP2() {
        salary = salary * 2;
        return salary;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee empl = new Employee("Ivan", 100.55);
        double d = empl.uvelichenie(empl.salary);
        System.out.println(d);
        System.out.println(empl.salary);
        empl.zP2();
        System.out.println(empl.salary);

    }
}

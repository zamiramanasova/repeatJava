package Lesson7;

public class Employee {
    public double salary;
    public void dvoynayaZP() {
        System.out.println("Novaya z/p =" + salary * 2);
    }

    public Employee(double salary2) {
        salary = salary2;
    }

    public static void main(String[] args) {
        Employee em = new Employee(500);
        System.out.println(em.salary);
        em.dvoynayaZP();
    }
}

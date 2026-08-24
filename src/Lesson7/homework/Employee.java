package Lesson7.homework;

public class Employee {
        int id;
        public String surname;
        int age;
        private double salary;
        String department;

        public Employee(int id1) {
            id = id1;
        }
        Employee(String surname2) {
            surname = surname2;
        }
        private Employee(double salary3) {
            salary = salary3;
        }
        public void method1() {
            System.out.println("Id " + id);
        }
        public void method2() {
            System.out.println("Surname  " + surname);
        }
        public void method3() {
            System.out.println("Salary " + salary);
        }

}


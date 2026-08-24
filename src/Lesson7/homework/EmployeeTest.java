package Lesson7.homework;

public class EmployeeTest {
        public static void main(String[] args) {
            Employee emp = new Employee(1);
            System.out.println(emp.id);
            Employee emp2 = new Employee("Petrov");
            System.out.println(emp2.surname + emp2.age);
//            Employee emp3 = new Employee(340000.00);
//            System.out.println(emp3.salary);
            emp.method1();
            emp.method2();
            emp.method3();

            emp2.method1();
            emp2.method2();
            emp2.method3();

//            emp3.method1();
//            emp3.method2();
//            emp3.method3();
        }
    }


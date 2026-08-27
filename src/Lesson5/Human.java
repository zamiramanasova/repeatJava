package Lesson5;

public class Human {
    String name;
    Car3 car;
    BankAccount bA;

    void info() {
        System.out.println("Imya: " + name +
                " cvet mashini " + car.color + " Balanse bankovskogo scheta: " + bA.balance);
    }
}

class HumanTest {
    public static void main(String[] args) {

        Human h = new Human();
        h.name = "David";
        h.car = new Car3("red", "V8");
        h.bA = new BankAccount(18,200.5);
        h.info();

        BankAccount bankAccount = new BankAccount(1, 200.0);
        System.out.println(bankAccount.popolnenieScheta(150.0));
        System.out.println(bankAccount.snytieSoScheta(50.0));

    }
}

class Car3 {
    String color;
    String engine;

    Car3(String c, String e) {
        color = c;
        engine = e;
    }

}
class BankAccount {
    int id;
    double balance;

    BankAccount(int id2, double balance2) {
       id = id2;
       balance = balance2;
    }

    double popolnenieScheta(double sum) {
        double result1 = sum + balance;
        return result1;
    }

    double snytieSoScheta(double minus) {
        double result2 = balance - minus;
        return result2;
    }
}

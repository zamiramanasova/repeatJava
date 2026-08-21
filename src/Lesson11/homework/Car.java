package Lesson11.homework;

public class Car {
    String color;
    String engine;
    int door;

    public Car(String color, String engine, int door) {
        this.color = color;
        this.engine = engine;
        this.door = door;
    }
}

class CarTest {
    void changeDoors(Car c, int door) {
        c.door = door;
    }

    void changeColor(Car c1, Car c2) {
        String color = c1.color;
        c1.color = c2.color;
        c2.color = color;
    }

    public static void main(String[] args) {
        CarTest ct = new CarTest();
        Car c1 = new Car("White","V6", 2);
        Car c2 = new Car("Black","V4", 3);

        ct.changeDoors(c1,3);
        ct.changeColor(c1,c2);
        System.out.println(c1.color + " " + c1.engine + " " + c1.door);
        System.out.println(c2.color + " " + c2.door + " " + c2.engine);
    }
}
package Practical_6;

class Vehicle {
    int speed = 60;
}

class Car extends Vehicle {
    int speed = 120;

    void showSpeed() {
        System.out.println("Car speed: " + speed);
        System.out.println("Vehicle speed: " + super.speed);
    }
}

public class vehiclecar {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.showSpeed();

    }
}
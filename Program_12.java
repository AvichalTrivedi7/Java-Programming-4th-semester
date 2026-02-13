// MethodOverriding display (Method overloading is different)

// Parent class

class Vehicle{
    void fuelEfficiency(){
        System.out.println("Calculating fuel efficiency for vehicle");
    }
}
// Child class 1   
class Car extends Vehicle{
    void fuelEfficiency(){
        System.out.println("Car fuel Efficiency: 15 km/l");
    }
}
// Child class 2 
class Bike extends Vehicle{
    void fuelEfficiency(){
        System.out.println("Bike fuel Efficiency: 40 km/l");
    }
}


// Main class
public class Program_12 {
    public static void main(String[] args){
        // Parent class reference variable and child class object
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        // Same class reference variable and same class object
        Vehicle v3 = new Vehicle();
        Car c1 = new Car();
        Bike b1 = new Bike();

        v1.fuelEfficiency();
        v2.fuelEfficiency();
        v3.fuelEfficiency();
        c1.fuelEfficiency();
        b1.fuelEfficiency();
    }
}

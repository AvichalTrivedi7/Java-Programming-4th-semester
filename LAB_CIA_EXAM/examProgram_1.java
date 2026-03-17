package LAB_CIA_EXAM;

class Vehicles{
    String brand;
    int speed;

    void describe(){
        System.out.println("The Brand is -->" + brand + " and the speed is -->" + speed);
    }
}

class ElectricVehicle extends Vehicles{
    int batteryCapacity;

    void describe(){
        super.describe();
        System.out.println("Also the battery capacity is -->" + batteryCapacity);
    }
}

public class examProgram_1 {
    public static void main(String[] args) {
        Vehicles v1 = new Vehicles();
        v1.brand = "BMW";
        v1.speed = 250; // This is in mph
        v1.describe();

        ElectricVehicle Ev1 = new ElectricVehicle();
        Ev1.batteryCapacity = 20000; //It's in maH
        Ev1.brand = "Koenigsegg"; //Inherited from parent class
        Ev1.speed = 350;
        Ev1.describe();
    }
}
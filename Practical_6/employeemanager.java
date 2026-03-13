package Practical_6;

abstract class Employee {

    final String companyName = "ABC Company";

    abstract void displayDetails();
}

class Manager extends Employee {

    String name = "Avichal";
    int age = 21;

    void displayDetails() {
        System.out.println("Company: " + companyName);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class employeemanager {
    public static void main(String[] args) {

        Manager m1 = new Manager();
        m1.displayDetails();

    }
}
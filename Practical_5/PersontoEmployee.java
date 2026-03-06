package Practical_5;
class Person {
    private String name;
    protected int age;

    // Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person constructor executed");
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    private double salary;

    // Constructor
    Employee(String name, int age, double salary) {
        super(name, age);  // call parent constructor
        this.salary = salary;
        System.out.println("Employee constructor executed");
    }

    // Overriding method
    void displayPerson() {
        super.displayPerson();   // call parent method
        System.out.println("Salary: " + salary);
    }
}

public class PersontoEmployee {
    public static void main(String[] args) {

        Employee e = new Employee("Alice", 30, 50000);

        System.out.println("\nEmployee Details:");
        e.displayPerson();
    }
}

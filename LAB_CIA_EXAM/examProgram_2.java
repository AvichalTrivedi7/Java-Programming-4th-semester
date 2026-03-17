package LAB_CIA_EXAM;

import java.util.Scanner;

abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInfo() {
        System.out.println("The name of this employee is --> " + name + " and the id is --> " + id);
    }

    abstract void computeSalary(Scanner sc);
}

class Manager extends Employee {

    Manager(String name, int id) {
        super(name, id);
    }

    void computeSalary(Scanner sc) {
        System.out.println("Enter hours worked: ");
        int hoursWorked = sc.nextInt();

        int bonusMultiplier = 7;
        int baseValue = 10000;

        System.out.println("Manager Salary --> " + (baseValue * hoursWorked * bonusMultiplier));
    }
}

class Developer extends Employee {

    Developer(String name, int id) {
        super(name, id);
    }

    void computeSalary(Scanner sc) {
        System.out.println("Enter number of projects: ");
        int projects = sc.nextInt();

        int perProject = 5000;

        System.out.println("Developer Salary --> " + (projects * perProject));
    }
}

class Intern extends Employee {

    Intern(String name, int id) {
        super(name, id);
    }

    void computeSalary(Scanner sc) {
        System.out.println("Enter stipend months: ");
        int months = sc.nextInt();

        int stipend = 10000;

        System.out.println("Intern Salary --> " + (months * stipend));
    }
}

public class examProgram_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee[] emp = new Employee[3];

        emp[0] = new Manager("Avichal", 1);
        emp[1] = new Developer("Shub", 2);
        emp[2] = new Intern("Ram", 3);

        for (int i = 0; i < emp.length; i++) {
            emp[i].displayInfo();
            emp[i].computeSalary(sc);
            System.out.println();
        }

        sc.close();
    }
}
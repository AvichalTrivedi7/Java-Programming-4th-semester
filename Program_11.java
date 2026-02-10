// Inheritance in java

// Parent class
class Person{
    String name;
    
    void displayName(){
        System.out.println("Name: " + name);
    }
}

// Child class
class Student extends Person{
    int rollNo;

    void displayRoll(){
        System.out.println("Roll no: " + rollNo);
    }
}


// Main class
public class Program_11 {
    public static void main(String[] args){
        Student s = new Student();
        s.name = "Amrit"; // Inherited attribute from person 
        s.rollNo = 101; // own attribute

        s.displayName(); // Inherited method
        s.displayRoll(); // own method

        // Parent class cannot access child attributes and methods
        Person P = new Person();
        P.name = "haha";
        // P.rollNo = 0; this will give error if wrote
        P.displayName();

    }
}

// Constructor thingies

class Animal{
    String name;
    Animal(){
        System.out.println("Step 1: Animal Constructor ran");
        name="Unknown";
    }
}

class Dog extends Animal{
    String breed;
    Dog(){
        System.out.println("Step 2: Dog Constructor ran");
        breed="Mixed";
    }
}

public class Program_14 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        System.out.println(myDog.breed);       
    }
}


/* Output is 
Step 1: Animal Constructor ran
Step 2: Dog Constructor ran 

because the child class contructor first goes to the parent class and that gets executed then it moves to the child class to execute the constructor*/

// This is also called constructor chaining, hierarchical execution of constructors from parent to child, if a child is called.
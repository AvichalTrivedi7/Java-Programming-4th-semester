package Programs_19and20.package_2;

import Programs_19and20.package_1.Animals;

class Dog extends Animals {
    protected void walk() {
        System.out.println("The Dog is walking...");
    }    // we override because then only can it be used from parent class and be visible as a protected class to the object.
    protected void talk() {
        System.out.println("The Dog is talking...");
    }
}

public class Pet {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.walk();
        d1.talk();
    }
}

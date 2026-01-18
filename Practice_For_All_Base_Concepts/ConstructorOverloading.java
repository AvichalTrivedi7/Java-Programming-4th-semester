package Practice_For_All_Base_Concepts;

public class ConstructorOverloading {

    ConstructorOverloading() {
        System.out.println("Default Constructor");
    }

    ConstructorOverloading(int a) {
        System.out.println("Constructor with int: " + a);
    }

    ConstructorOverloading(int a, int b) {
        System.out.println("Constructor with two ints: " + (a + b));
    }

    public static void main(String[] args) {
        new ConstructorOverloading();
        new ConstructorOverloading(10);
        new ConstructorOverloading(10, 20);
    }
}

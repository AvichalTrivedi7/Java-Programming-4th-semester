package Practice_For_All_Base_Concepts;

public class MethodOverloading {

    static void display(int a, float b) {
        System.out.println("int first: " + a + ", float second: " + b);
    }

    static void display(float b, int a) {
        System.out.println("float first: " + b + ", int second: " + a);
    }

    public static void main(String[] args) {
        display(10, 5.5f);
        display(3.3f, 20);
    }
}

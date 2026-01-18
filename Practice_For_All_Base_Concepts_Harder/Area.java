package Practice_For_All_Base_Concepts_Harder;

public class Area {

    static double area(double r) {
        return 3.14 * r * r;
    }

    static int area(int l, int b) {
        return l * b;
    }

    public static void main(String[] args) {
        System.out.println("Circle Area = " + area(5));
        System.out.println("Rectangle Area = " + area(4, 6));
    }
}

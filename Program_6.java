//Scanner module for taking user inputs

import java.util.Scanner;

public class Program_6{

    // Static method for integers
    static int plusMethodInt(int x, int y) {
        return x + y;
    }

    // Static method for doubles
    static double plusMethodDouble(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Integer input
        System.out.print("Enter first integer: ");
        int a = sc.nextInt();

        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        int intResult = plusMethodInt(a, b);
        
        // Output
        System.out.println("int result: " + intResult);
        
        // Double input
        System.out.print("Enter first double value: ");
        double x = sc.nextDouble();

        System.out.print("Enter second double value: ");
        double y = sc.nextDouble();

        double doubleResult = plusMethodDouble(x, y);

        // Output
        System.out.println("double result: " + doubleResult);

        sc.close();
    }
}
package Practice_For_All_Base_Concepts;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter Celsius: ");
                float c = sc.nextFloat();
                float f = (c * 9 / 5) + 32;
                System.out.println("Fahrenheit = " + f);
                break;

            case 2:
                System.out.print("Enter Fahrenheit: ");
                float f1 = sc.nextFloat();
                float c1 = (f1 - 32) * 5 / 9;
                System.out.println("Celsius = " + c1);
                break;

            default:
                System.out.println("Invalid choice");
        sc.close();
        }
    }
}

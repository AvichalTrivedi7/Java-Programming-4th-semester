package Practice_For_All_Base_Concepts_Harder;

import java.util.Scanner;

public class MenuApp {

    static void add() {
        System.out.println("Addition selected");
    }

    static void subtract() {
        System.out.println("Subtraction selected");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("1.Add  2.Subtract");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                add();
                break;
            case 2:
                subtract();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}

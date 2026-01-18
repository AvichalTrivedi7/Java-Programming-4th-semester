//Java program to calculate electricity bill using conditional statements.

package Practice_For_All_Base_Concepts;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        int bill;

        if (units <= 100) {
            bill = units * 1;
        } else if (units <= 200) {
            bill = units * 2;
        } else {
            bill = units * 3;
        }

        System.out.println("Electricity Bill = ₹" + bill);
    }
}


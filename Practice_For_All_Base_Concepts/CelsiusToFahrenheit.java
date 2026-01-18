package Practice_For_All_Base_Concepts;

import java.util.Scanner;

public class CelsiusToFahrenheit {

    static float convert(float c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Celsius: ");
        float c = sc.nextFloat();

        float f = convert(c);
        System.out.println("Fahrenheit = " + f);
    }
}


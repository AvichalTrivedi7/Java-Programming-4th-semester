package Practice_For_All_Base_Concepts_Harder;

import java.util.Scanner;

public class Interest {

    static double simpleInterest(double p, double r, double t) {
        return (p * r * t) / 100;
    }

    static double compoundInterest(double p, double r, double t) {
        return p * Math.pow(1 + r / 100, t) - p;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal, rate, time: ");
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();

        System.out.println("Simple Interest = " + simpleInterest(p, r, t));
        System.out.println("Compound Interest = " + compoundInterest(p, r, t));
    }
}

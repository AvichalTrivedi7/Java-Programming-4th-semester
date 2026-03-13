package Practical_6;
import java.util.Scanner;

abstract class Shape{
    abstract void calculateArea();
}

class Circle extends Shape{
    void calculateArea(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Kindly enter the radius of the circle: ");
        int radius = sc.nextInt();
        System.out.println("The area of the circle is: " + 3.14*(radius*radius));
        sc.close();
    }
}

class Rectangle extends Shape{
    void calculateArea(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Kindly enter the length of the rectangle: "); 
        int length = sc.nextInt();
        System.out.println("Kindly enter the breadth of the rectangle: "); 
        int breadth = sc.nextInt();
        System.out.println("The area of the rectangle is: " + length*breadth);
        sc.close();
    }
}

public class shapes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to find the area of 1) rectangle or 2) circle, enter (1,2)");
        int choice = sc.nextInt();
        if (choice==1){
            Rectangle r1 = new Rectangle();
            r1.calculateArea();
        }
        else if (choice==2){
            Circle c1 = new Circle();
            c1.calculateArea();
        }
        else {
            System.out.println("Kindly enter 1 or 2");
        }
        sc.close();
    }
}

package Practical_1;

public class Rectangle {
    int length;
    int breadth;

    void area()
    {
        System.out.println("Area --> " + length*breadth);
    }
    public static void main(String[] args)
    {
        Rectangle Rec1 = new Rectangle();
        Rec1.length = 7;
        Rec1.breadth = 7;
        
        Rectangle Rec2 = new Rectangle();
        Rec2.length = 9;
        Rec2.breadth = 9;

        Rec1.area();
        Rec2.area();

    }
}

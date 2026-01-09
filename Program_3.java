/* 
Methods / Functions --- Parameterized
Methods / Functions --- Non-Parameterized 
*/

public class Program_3
{
    void area_square(int side)
    {
        System.out.println(side*side);
    }
    void area_rectangle(int length, int breadth)
    {
        System.out.println(length*breadth);
    }
    public static void main(String[] args)
    {
        Program_3 calc = new Program_3();
        calc.area_square(5);
        calc.area_rectangle(7, 8);
    }
} 


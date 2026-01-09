package Practical_1;

public class Book 
{
    String Title = "Rich Dad Poor Dad";
    double Price = 599.99;
    public static void main(String[] args)
        {
            Book Book1 = new Book();
            System.out.println("Title --> " + Book1.Title + "\n" + "Price --> " + Book1.Price);
        }
}

// Another way
/*
public class Book
{
    String Title;
    double Price;

public static void main(String[] args)
{
    Book Book2 = new Book();
    Book2.Title = "Where winds meet";
    Book2.Price = 999.99;
    System.out.println("Title --> " + Book2.Title + "\n" + "Price --> " + Book2.Price);
}
}
*/
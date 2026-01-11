// Trying classes, objects, methods, initializing attributes of class, calling functions, etc,.

public class Program_2 
{
    public static void main(String[] args) 
    {
        Student s1 = new Student(); // Object Creation
        s1.id = 101;
        s1.name = "Amrit";

        Student s2 = new Student(); 
        s2.id = 102;
        s2.name = "Rahul";

        Student s3 = new Student(); 
        s3.name = "Shubhashish Ramakrishna Venkateshwara Narsingh Garimella";

        s1.display();
        s2.display();
        s3.display();
    }
}

// Constructor is a function with the same name as the class name and is used to provide initial values to the attributes.

class Student 
{
    int id = 5;
    String name;

    void display() 
    {
        System.out.println(id + " " + name);
    }
}

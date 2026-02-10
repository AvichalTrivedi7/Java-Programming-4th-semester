// About constructor overloading 

class Students{
    String name;
    int age;
    
    // Contructors are quite special they are only meant for assignment purposes. They do NOT EVEN have void return type, they just have no return. (Yes two different things) 
    // Constructor 1 (automatically done by jvm, we are just doing it to show how it works in the backend)
    Students(){
        name = " ";
        age = 0;
    }

    // Constructor 2
    Students(String n){
        name = n;
        age = 0;
    }

    // Constructor 3
    Students(String n, int a){
        name = n;
        age = a;
    }

    void display(){
        System.out.println(name + " " + age);
    }
}

public class Program_8{
    public static void main(String[] args){
        Students s1 = new Students();
        Students s2 = new Students("Avi");
        Students s3 = new Students("Avi", 21);

        s1.display();
        s2.display();
        s3.display();
    }
}

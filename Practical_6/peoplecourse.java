package Practical_6;

class People{
    String name;
    int age;

    People(String name, int age){
        this.name = name;
        this.age = age;
    }
}
class Academician extends People{
    String course;

    Academician(String name, int age, String course){
        super(name, age);
        this.course = course;
    } 
    
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}
public class peoplecourse {
    public static void main(String[] args){
        Academician a1 = new Academician("Avichal", 21, "ComputerScience");
        a1.display();
    }
    
}

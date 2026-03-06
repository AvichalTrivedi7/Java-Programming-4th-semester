// Super keyword - used to explicitly use a method of the parent class that is usually/implicitly overriden.
// super(), super.variable, super.function
// implicitly super does work even if not written ourselves, as we saw in last program, that is the reason first parent class constructor got executed then the child's.

class Person1{
    String name;
    int age;
    
    Person1(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Person created: " + name);
    }
}

class Student3 extends Person1{
    String major;
    double gpa;

    Student3(String name, int age, String major, double gpa){
        super(name,age);

        this.major = major;
        this.gpa = gpa;
        System.out.println("Student created: major=" + major);
    }
    void display(){
        System.out.println(name + "| Age:" + age
        + "| Major:" + major
        + "| GPA:" + gpa);
    }
}

public class Program_15 {
    public static void main(String[] args) {
        Student3 s = new Student3 ("Alice", 20, "Computer Science", 3.8);
        s.display();
    }
}

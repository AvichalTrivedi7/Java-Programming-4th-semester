// "this" keyword usage 

class Student2{
    int id;
    String name;

    Student2(int id, String name){
        this.id = id;
        this.name = name;
    }

    void display(){
        System.out.println(id + " " + name);
    }
} 

public class Program_13 {
    public static void main(String[] args){
        Student2 s = new Student2(1, "Amrit");
        s.display();
    }
}

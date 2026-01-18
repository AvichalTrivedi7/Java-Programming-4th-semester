package Practice_For_All_Base_Concepts_Harder;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        Student s = new Student(1, "Avichal");
        s.display();
    }
}


package Practice_For_All_Base_Concepts_Harder;

class Students {
    int id;
    String name;

    Students(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        Students s = new Students(1, "Avichal");
        s.display();
    }
}


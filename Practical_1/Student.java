package Practical_1;

public class Student {
    String Name;
    int Rollno;

    void showDetails()
    {
        System.out.println("Name --> " + Name + "\n" + "Roll no. --> " + Rollno);
    }
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.Name = "Avichal";
        s1.Rollno = 001;

        Student s2 = new Student();
        s2.Name = "Shubhashish";
        s2.Rollno = 002;

        s1.showDetails();
        s2.showDetails();
    }
}

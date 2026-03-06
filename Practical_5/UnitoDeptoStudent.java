package Practical_5;
class University {
    protected String universityName;

    University(String universityName) {
        this.universityName = universityName;
        System.out.println("University constructor executed");
    }

    void showUniversity() {
        System.out.println("University: " + universityName);
    }
}

class Department extends University {
    protected String departmentName;

    Department(String universityName, String departmentName) {
        super(universityName);
        this.departmentName = departmentName;
        System.out.println("Department constructor executed");
    }

    void showDepartment() {
        System.out.println("Department: " + departmentName);
    }
}

class Student extends Department {
    private int rollNo;

    Student(String universityName, String departmentName, int rollNo) {
        super(universityName, departmentName);
        this.rollNo = rollNo;
        System.out.println("Student constructor executed");
    }

    // Overriding
    void showUniversity() {
        super.showUniversity();   // call parent method
        System.out.println("(Called from Student class)");
    }

    void showStudent() {
        System.out.println("Roll No: " + rollNo);
    }
}

public class UnitoDeptoStudent {
    public static void main(String[] args) {

        Student s = new Student("Christ University", "Data Science", 101);

        System.out.println("\nStudent Details:");
        s.showUniversity();
        s.showDepartment();
        s.showStudent();
    }
}

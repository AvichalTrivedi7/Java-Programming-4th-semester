// Conditional Statements

public class Program_5 { 
    static void checkAge(int age){
        if (age<18){
            System.out.println("Access Denied: You are not old enough !");
        }
        else{
            System.out.println("Access Granted: You are old enough");
        }
    }    
    public static void main(String[] args) {
        checkAge(7);
        checkAge(27);
    }
}

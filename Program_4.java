// Static methods and Non-Static methods

public class Program_4 {
    int myMethod(int a){
        return(5+a);
    }
    static int myMethod2(int a){
        return(5+a);
    }
    public static void main(String[] args){
        Program_4 obj = new Program_4();
        int x = obj.myMethod(7);
        System.out.println(x);   // for non static functions you need to make objects to print it's value
        System.out.println(myMethod2(7)); // for static functions you can directly call and print it's value, wihtout making objects.
    }   
}

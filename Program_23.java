public class Program_23 extends Thread{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread " + i + " is running");
        }
    }

    public static void main(String[] args) {
        Program_23 t1 = new Program_23();
        Program_23 t2 = new Program_23();
        Program_23 t3 = new Program_23();

        t1.start();
        t2.start();
        t3.start();
    }
}
    

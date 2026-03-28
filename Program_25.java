class Counter implements Runnable {
    String name;
    int limit;

    Counter(String name, int limit) {
        this.name = name;
        this.limit = limit;
    }

    public void run() {
        for (int i = 1; i <= limit; i++) {
            System.out.println(name + ": " + i);
        }
    }
}

public class Program_25 {
    public static void main(String[] args) {
       // Create 3 threads
        Thread t1 = new Thread(new Counter("Alpha", 3));
        Thread t2 = new Thread(new Counter("Beta", 3));
        Thread t3 = new Thread(new Counter("Gamma", 3));

        // Start threads (they run simultaneously)
        t1.start();
        t2.start();
        t3.start();

        // Output order is random (threads run independently) 
    }
}
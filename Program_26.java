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

            try {
                Thread.sleep(300); // slow down for visibility
            } catch (Exception e) {
            }
        }
    }
}


public class Program_26 {
    public static void main(String[] args) throws Exception {

        Thread t = new Thread(new Counter("Worker", 5));
        t.start();

        // Check if thread is still running
        while (t.isAlive()) {
            System.out.println("Still running...");
            Thread.sleep(200);
        }

        System.out.println("Thread finished");
    }
}
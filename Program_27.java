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


public class Program_27 {
    public static void main(String[] args) throws Exception {

        Thread t1 = new Thread(new Counter("A", 3));
        Thread t2 = new Thread(new Counter("B", 3));

        t1.start();
        t2.start();

        // Wait for both threads to finish
        t1.join();
        t2.join();

        System.out.println("Both threads done - safe to continue");

        // join with timeout (optional)
        t1.join(2000); // waits max 2 seconds
    }
}

/* Output order in threads = ❌ NOT FIXED
Always use try-catch with sleep()
join() = makes execution sequential
isAlive() = used for monitoring */

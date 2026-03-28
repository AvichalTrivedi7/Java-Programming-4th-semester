/*Thread.sleep(ms) - Go to sleep after running the amount of ms given, Thread.currentThread() - Current executing thread, Thread.isAlive() - which thread is alive currently, Thread.interrupt() -   */  

class Counter implements Runnable{
    private String name;
    private int count;

    Counter(String name, int count){
        this.name = name;
        this.count = count;
    }

    public void run(){
        for (int i = 1; i <= count; i++){
            System.out.println(name + ": " + i);
            try{
                Thread.sleep(100);
            } 
            catch (InterruptedException e){
                Thread.currentThread().interrupt();
            };
        }
        System.out.println(name + ": DONE");
    }
}


public class Program_24 {
    public static void main(String[] args) {
        Thread t = new Thread(new Counter("CounterA", 5), "my-thread");
        t.start();
        System.out.println("Main continues while thread runs!");
    }
}

/* Never call run() directly! That executes the code on the current thread — no new thread is created. Always call start() to launch a new thread of execution. */

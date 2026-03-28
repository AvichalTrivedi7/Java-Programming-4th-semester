class BackgroundTask implements Runnable {
    public void run() {
        System.out.println("Background task running");
    }
}

class UIRenderer implements Runnable {
    public void run() {
        System.out.println("UI rendering running");
    }
}


public class Program_28 {
    public static void main(String[] args) {

        Thread bg = new Thread(new BackgroundTask());
        Thread ui = new Thread(new UIRenderer());

        // Set priorities
        bg.setPriority(Thread.MIN_PRIORITY);   // 1 (low)
        ui.setPriority(Thread.MAX_PRIORITY);   // 10 (high)

        // Default is Thread.NORM_PRIORITY (5)

        // Check priority
        System.out.println("UI Priority: " + ui.getPriority());

        bg.start();
        ui.start();
    }
}

/* | Concept         | Meaning                           |
| --------------- | --------------------------------- |
| `start()`       | starts thread execution           |
| `run()`         | actual work of thread             |
| `isAlive()`     | checks if thread is still running |
| `join()`        | waits for thread to finish        |
| `sleep(ms)`     | pauses thread                     |
| `setPriority()` | sets importance (1–10)            |
 */
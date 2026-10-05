package threads;

public class ThreadSleep implements Runnable {

    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread Time: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadSleep(), "MyThread");
        thread.start();
    }
}

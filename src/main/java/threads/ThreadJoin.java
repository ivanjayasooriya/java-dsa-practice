package threads;

public class ThreadJoin implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread Created");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new ThreadJoin());
        thread.start();

//        Wait for this Thread to finish. After that, the main thread will continue executing.
        thread.join();

        System.out.println("Continue Main");
    }
}

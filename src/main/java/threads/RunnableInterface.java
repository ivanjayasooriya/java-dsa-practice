package threads;

public class RunnableInterface implements Runnable {

    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        RunnableInterface runnableInterface = new RunnableInterface();
        Thread thread = new Thread(runnableInterface);
        thread.start();
    }
}

package threads;

public class RunnableWithLambda {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Hello World!");
        Thread thread = new Thread(runnable);
        thread.start();

//        or

        Thread thread2 = new Thread(() -> System.out.println("Hello World!"));
        thread2.start();
    }
}

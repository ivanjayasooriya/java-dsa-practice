package threads;

public class ThreadNaming {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("Hello World!"));
        thread.setName("MyThread1");
        thread.start();

//        or

        Thread thread2 = new Thread(() -> System.out.println("Hello World!"), "MyThread2");
        thread2.start();

//        get names
        System.out.println("Thread name: " + thread.getName());
        System.out.println("Thread name: " + thread2.getName());

        System.out.println("Thread name: " + Thread.currentThread().getName());
    }
}

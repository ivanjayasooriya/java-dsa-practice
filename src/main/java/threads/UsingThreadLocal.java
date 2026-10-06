package threads;

import java.util.concurrent.atomic.AtomicInteger;

public class UsingThreadLocal {
    public static void main(String[] args) {
        AtomicInteger count = new AtomicInteger();
        ThreadLocal<Integer> threadLocalCount = new ThreadLocal<>();

        Thread t1 = new Thread(() -> {
            threadLocalCount.set(0);
            for (int i = 0; i < 5; i++) {
                count.getAndIncrement();
                threadLocalCount.set(threadLocalCount.get() + 1);
            }
            System.out.println("ThreadLocal(t1) Count: " + threadLocalCount.get());
        });

        Thread t2 = new Thread(() -> {
            threadLocalCount.set(0);
            for (int i = 0; i < 5; i++) {
                count.getAndIncrement();
                threadLocalCount.set(threadLocalCount.get() + 1);
            }
            System.out.println("ThreadLocal(t2) Count: " + threadLocalCount.get());
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Count: " + count);
        System.out.println("ThreadLocal Count: " + threadLocalCount.get());
    }
}

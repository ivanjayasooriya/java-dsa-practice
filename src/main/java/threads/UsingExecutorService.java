package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsingExecutorService {
    public static void main(String[] args) {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(4);

        fixedThreadPool.submit(() -> System.out.println("Hello"));
        fixedThreadPool.shutdown();

        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

        cachedThreadPool.submit(() -> System.out.println("Hello"));
        cachedThreadPool.shutdown();

        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();

        singleThreadExecutor.submit(() -> System.out.println("Hello"));
        singleThreadExecutor.shutdown();

        ExecutorService virtualThreadExecutor = Executors.newVirtualThreadPerTaskExecutor();

        virtualThreadExecutor.submit(() -> System.out.println("Hello"));
        virtualThreadExecutor.shutdown();
    }
}

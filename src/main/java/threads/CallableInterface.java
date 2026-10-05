package threads;

import java.util.concurrent.*;

public class CallableInterface {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Callable<String> callable = () -> "Hello, World!";

        Future<String> future = executor.submit(callable);
        System.out.println(future.get());

        executor.shutdown();
    }
}

package threads.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UsingTryLock {
    public static void main(String[] args) {
        int count = 0;
        Lock lock = new ReentrantLock();

        if (lock.tryLock()) {
            try {
                // Work
                count++;
            } finally {
                lock.unlock();
            }

        } else {
            // Other work
            System.out.println("Lock not acquired");
        }
    }
}

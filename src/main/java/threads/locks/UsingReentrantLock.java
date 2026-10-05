package threads.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UsingReentrantLock {
    public static void main(String[] args) {
        int count = 0;

        Lock lock = new ReentrantLock();
        lock.lock();

        try {
            count++;
        } finally {
            lock.unlock();
        }
    }
}

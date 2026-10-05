package threads;

public class Counter {
    int count = 0;

    public synchronized void increment() {
        count++;
    }

//    or

//    public void increment() {
//        synchronized(this) {
//            count++;
//        }
//    }

    public int getCount() {
        return count;
    }
}

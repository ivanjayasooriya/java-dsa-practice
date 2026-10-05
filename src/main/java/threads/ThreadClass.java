package threads;

public class ThreadClass extends Thread {
    public void run() {
        System.out.println("ThreadClass is running");
    }

    public static void main(String[] args) {
        ThreadClass threadClass = new ThreadClass();
        threadClass.start();
    }
}

package design_patterns.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        // Create the Subject
        YouTubeChannel techChannel = new YouTubeChannel();

        // Create Observers
        Subscriber alice = new Subscriber("Alice");
        Subscriber bob = new Subscriber("Bob");
        Subscriber charlie = new Subscriber("Charlie");

        // Register Observers
        techChannel.registerObserver(alice);
        techChannel.registerObserver(bob);
        techChannel.registerObserver(charlie);

        // State changes (triggers notifications)
        techChannel.uploadVideo("Java Design Patterns Tutorial");

        // Unregister an Observer
        techChannel.removeObserver(bob);

        // Next state change (only Alice and Charlie will be notified)
        techChannel.uploadVideo("Mastering Modern Java Features");
    }
}

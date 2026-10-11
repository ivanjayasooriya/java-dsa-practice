package design_patterns.behavioral.observer;

// ConcreteObserver.java
public class Subscriber implements Observer {
    private final String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String videoTitle) {
        System.out.println(name + " received a notification! New video out: " + videoTitle);
    }
}

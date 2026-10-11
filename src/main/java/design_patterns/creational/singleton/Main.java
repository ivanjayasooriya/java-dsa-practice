package design_patterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
//        Singleton
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();
    }
}

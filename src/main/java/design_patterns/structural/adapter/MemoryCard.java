package design_patterns.structural.adapter;

// The legacy/incompatible class that needs to be adapted
public class MemoryCard {
    public void insert() {
        System.out.println("Memory Card successfully inserted.");
    }

    public void readData() {
        System.out.println("Reading data from the Memory Card.");
    }
}

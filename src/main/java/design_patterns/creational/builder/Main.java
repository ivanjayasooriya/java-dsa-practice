package design_patterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        // Constructing an object with only required parameters
        Computer officePC = new Computer.Builder("Intel i3", "8GB").build();

        // Constructing an object with optional parameters using method chaining
        Computer gamingPC = new Computer.Builder("AMD Ryzen 9", "32GB")
                .setStorage("2TB NVMe SSD")
                .setHasGraphicsCard(true)
                .build();

        System.out.println("Office PC: " + officePC);
        System.out.println("Gaming PC: " + gamingPC);
    }
}

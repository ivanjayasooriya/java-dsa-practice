package design_patterns.creational.builder;

public class Computer {
    // All attributes are final to ensure immutability
    private final String cpu;        // Required
    private final String ram;        // Required
    private final String storage;    // Optional
    private final boolean hasGraphicsCard; // Optional

    // Private constructor ensures the object can ONLY be created via the Builder
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.hasGraphicsCard = builder.hasGraphicsCard;
    }

    // Getters (No Setters to maintain immutability)
    public String getCpu() { return cpu; }
    public String getRam() { return ram; }
    public String getStorage() { return storage; }
    public boolean isHasGraphicsCard() { return hasGraphicsCard; }

    // Static Nested Builder Class
    public static class Builder {
        private final String cpu;     // Required parameters are final
        private final String ram;     // Required parameters are final
        private String storage = "256GB SSD"; // Default value for optional parameter
        private boolean hasGraphicsCard = false;

        // Constructor handles ONLY the mandatory parameters
        public Builder(String cpu, String ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        // Chained setter for optional storage
        public Builder setStorage(String storage) {
            this.storage = storage;
            return this; // Returns the builder instance for method chaining
        }

        // Chained setter for optional graphics card
        public Builder setHasGraphicsCard(boolean hasGraphicsCard) {
            this.hasGraphicsCard = hasGraphicsCard;
            return this;
        }

        // The build method that delivers the final Product
        public Computer build() {
            return new Computer(this);
        }
    }
}

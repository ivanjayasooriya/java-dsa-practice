package design_patterns.behavioral.strategy;

// ShoppingCart.java
public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    // Set strategy via constructor
    public ShoppingCart(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Allow changing the strategy at runtime
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(double amount) {
        // Delegate behavior to the strategy object
        paymentStrategy.pay(amount);
    }
}

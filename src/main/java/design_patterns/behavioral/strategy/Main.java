package design_patterns.behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        // Checkout using Credit Card
        ShoppingCart cart = new ShoppingCart(new CreditCardPayment("1234-5678-9012-3456"));
        cart.checkout(150.50);
        // Output: Paid $150.5 using Credit Card (1234-5678-9012-3456).

        // Swap strategy at runtime to PayPal
        cart.setPaymentStrategy(new PayPalPayment("user@example.com"));
        cart.checkout(89.99);
        // Output: Paid $89.99 using PayPal account: user@example.com
    }
}

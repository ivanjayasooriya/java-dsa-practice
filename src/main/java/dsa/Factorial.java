package dsa;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Factorial of 4 is: " + factorial(4));
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}

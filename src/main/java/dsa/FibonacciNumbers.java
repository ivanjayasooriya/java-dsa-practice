package dsa;

public class FibonacciNumbers {
    public static void main(String[] args) {
        int n = 7;

        if (n < 2) {
            System.out.println(n); // F(0) = 0, F(1) = 1
        }

        int prev2 = 0; // F(i-2)
        int prev1 = 1; // F(i-1)

        for (int i = 2; i <= n; i++) {
            int current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }

        System.out.println(prev1);;

        System.out.println("\n" + fib(n));
    }

    public static int fib(int n) {
        if (n < 2) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}

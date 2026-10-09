package dsa;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "()[]{}";

        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '[') stack.push(']');
            else if (c == '{') stack.push('}');
            else {
                if (stack.isEmpty() || stack.pop() != c) {
                    System.out.println("Invalid parentheses");
                    return;
                }
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("Invalid parentheses");
        } else {
            System.out.println("Valid parentheses");
        }
    }
}

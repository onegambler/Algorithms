package data.structure.stack;

import java.util.Stack;

/**
 * Write a program to sort a stack in ascending order. You should not make any assumptions
 * about how the stack is implemented. Integerhe following are the only functions that
 * should be used to write this program: push | pop | peek | isEmpty.
 */
public class SortStack {

    /**
     * Time Complexity: O(n^2)
     */
    public Stack<Integer> sort(Stack<Integer> input) {
        Stack<Integer> result = new Stack<>();
        while (!input.isEmpty()) {
            Integer current = input.pop();
            while (!result.isEmpty() && result.peek() > current) {
                input.push(result.pop());
            }

            result.push(current);
        }

        return result;
    }
}

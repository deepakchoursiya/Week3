package Day02.stack_and_queue.sort_stack_recursion;

import java.util.Stack;

public class SortStack {

    // Function to sort the stack using recursion
    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            // Step 1: Remove the top element
            int top = stack.pop();

            // Step 2: Recursively sort the remaining stack
            sortStack(stack);

            // Step 3: Insert the popped element at the correct position
            insertSorted(stack, top);
        }
    }

    // Helper function to insert an element into the sorted stack
    private static void insertSorted(Stack<Integer> stack, int value) {
        // Base case: If stack is empty or the top element is smaller than value
        if (stack.isEmpty() || stack.peek() <= value) {
            stack.push(value);
            return;
        }

        // Remove the top element and insert value at the correct position
        int top = stack.pop();
        insertSorted(stack, value);

        // Push back the removed element
        stack.push(top);
    }

}

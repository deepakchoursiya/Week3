package Day02.stack_and_queue.sort_stack_recursion;

import java.util.Stack;

public class Main {


    // Main function to test the sorting
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(1);
        stack.push(3);
        stack.push(8);
        stack.push(2);

        System.out.println("Original Stack: " + stack);

        SortStack.sortStack(stack);

        System.out.println("Sorted Stack: " + stack);
    }

}

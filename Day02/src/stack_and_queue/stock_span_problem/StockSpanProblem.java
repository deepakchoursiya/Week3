package Day02.stack_and_queue.stock_span_problem;

import java.util.Stack;

public class StockSpanProblem {

    // Function to calculate stock span
        public static int[] calculateSpan(int[] prices) {
            int n = prices.length;
            int[] span = new int[n];
            Stack<Integer> stack = new Stack<>();

            for (int i = 0; i < n; i++) {
                // Pop elements from stack while the current price is greater
                while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                    stack.pop();
                }

                // If stack is empty, all previous prices are less or equal
                span[i] = (stack.isEmpty()) ? (i + 1) : (i - stack.peek());

                // Push current index to stack
                stack.push(i);
            }

            return span;
        }

    }




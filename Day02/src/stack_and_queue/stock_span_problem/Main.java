package Day02.stack_and_queue.stock_span_problem;

public class Main {

    // Main function to test the algorithm
    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] spans = StockSpanProblem.calculateSpan(prices);

        // Print the spans
        System.out.print("Stock Spans: ");
        for (int span : spans) {
            System.out.print(span + " ");
        }
    }

}

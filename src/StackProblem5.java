import java.util.Stack;

public class StackProblem5 {
    public static void main(String[] args) {
        StockSpanner stockSpanner = new StockSpanner();

        System.out.println(stockSpanner.next(100)); // 1
        System.out.println(stockSpanner.next(80)); // 1
        System.out.println(stockSpanner.next(60)); // 1
        System.out.println(stockSpanner.next(70)); // 2
        System.out.println(stockSpanner.next(60)); // 1
        System.out.println(stockSpanner.next(75)); // 4
        System.out.println(stockSpanner.next(85)); // 6
    }
}

class StockSpanner {
    private Stack<int[]> stack;

    public StockSpanner() {
        stack = new Stack<>();
    }

    public int next(int price) {
        int span = 1;

        // Pop elements from stack while the price is greater than or equal to the
        // stack's top element's price
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1]; // Add the span of the popped element
        }

        // Push the current price and its span onto the stack
        stack.push(new int[] { price, span });

        return span;
    }
}
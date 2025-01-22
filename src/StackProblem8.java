import java.util.Stack;

public class StackProblem8 {
    public static void main(String[] args) {
        int[] heights = { 2, 1, 5, 6, 2, 3 };

        System.out.println(largestRectangleArea(heights));
    }

    static void printArray(int[] arr) {
        System.out.print("[ ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }

    static int largestRectangleArea(int[] heights) {
        int[] left = findPrevSmaller(heights);
        int[] right = findNextSmaller(heights);

        printArray(left);
        printArray(right);

        int maxArea = 0;

        for (int i = 0; i < heights.length; i++) {
            int width = right[i] - left[i] - 1;
            int area = width * heights[i];
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    static int[] findPrevSmaller(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

            stack.push(i);
        }

        return result;
    }

    static int[] findNextSmaller(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        int[] result = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                result[i] = arr.length;
            } else {
                result[i] = stack.peek();
            }

            stack.push(i);
        }

        return result;
    }

    static int largestRectangleAreaV2(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int n = heights.length;
        int maxArea = 0;

        for (int i = 0; i <= n; i++) {
            int h = (i == n ? 0 : heights[i]);

            while (!stack.isEmpty() && h < heights[stack.peek()]) {
                int tp = heights[stack.pop()];
                int ps = stack.isEmpty() ? -1 : stack.peek();
                maxArea = Math.max(maxArea, tp * (i - ps - 1));
            }

            stack.push(i);

        }

        return maxArea;
    }

    static int largestRectangleAreaV3(int[] heights) {
        int[] stack = new int[heights.length];
        int top = -1;
        int n = heights.length;
        int maxArea = 0;

        for (int i = 0; i <= n; i++) {
            int h = (i == n ? 0 : heights[i]);

            while (top != -1 && h < heights[stack[top]]) {
                int tp = heights[stack[top--]];
                int ps = top == -1 ? -1 : stack[top];
                maxArea = Math.max(maxArea, tp * (i - ps - 1));
            }

            stack[++top] = i;

        }

        return maxArea;
    }
}

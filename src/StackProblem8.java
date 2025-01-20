import java.util.Stack;

public class StackProblem8 {
    public static void main(String[] args) {
        int[] heights = { 2, 1, 5, 6, 2, 3 };

        System.out.println(largestRectangleArea(heights));
    }

    static int largestRectangleArea(int[] heights) {
        int[] left = findPrevSmaller(heights);
        int[] right = findNextSmaller(heights);

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
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

            stack.push(arr[i]);
        }

        return result;
    }

    static int[] findNextSmaller(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        int[] result = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                result[i] = arr.length;
            } else {
                result[i] = stack.peek();
            }

            stack.push(arr[i]);
        }

        return result;
    }

}

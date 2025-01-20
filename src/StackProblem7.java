import java.util.Stack;

public class StackProblem7 {
    public static void main(String[] args) {
        // int[] nums = { 1, 2, 3, 4, 3 };
        // int[] result = nextGreaterElements(nums);

        // for (int i : result) {
        // System.out.print(i + " ");
        // }

        int[] prices = { 10, 1, 1, 6 };

        int[] result = finalPrices(prices);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    static int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] ip = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {
            ip[i] = nums[i];
            ip[i + nums.length] = nums[i];
        }

        int[] result = new int[nums.length];

        for (int i = ip.length - 1; i >= 0; i--) {

            while (!stack.isEmpty() && ip[i] >= stack.peek()) {
                stack.pop();
            }

            if (i < nums.length) {
                if (stack.isEmpty()) {
                    result[i] = -1;
                } else {
                    result[i] = stack.peek();
                }
            }

            stack.push(ip[i]);

        }

        return result;
    }

    static int[] nextGreaterElementsV2(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[nums.length];

        for (int i = 2 * nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums[i % nums.length]) {
                stack.pop();
            }

            if (i < nums.length) {
                if (stack.isEmpty()) {
                    result[i] = -1;
                } else {
                    result[i] = stack.peek();
                }
            }

            stack.push(nums[i % nums.length]);
        }

        return result;
    }

    static int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();

        int[] result = new int[prices.length];

        for (int i = prices.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() >= prices[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                result[i] = prices[i];
            } else {
                result[i] = prices[i] - stack.peek();
            }

            stack.push(prices[i]);
        }

        return result;
    }

}

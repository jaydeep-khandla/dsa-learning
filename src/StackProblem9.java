import java.util.Stack;

public class StackProblem9 {
    public static void main(String[] args) {
        String s = ")()())";

        System.out.println(longestValidParentheses(s));
        System.out.println(longestValidParenthesesV2(s));
        System.out.println(longestValidParenthesesV3(s));
    }

    static int longestValidParentheses(String s) {
        int n = s.length();
        int longest = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(i);
            } else {
                if (!stack.isEmpty() && s.charAt(stack.peek()) == '(') {
                    stack.pop();
                } else {
                    stack.push(i);
                }
            }
        }

        if (stack.isEmpty()) {
            longest = n;
        } else {
            int a = n, b = 0;

            while (!stack.isEmpty()) {
                b = stack.pop();
                longest = Math.max(longest, a - b - 1);
                a = b;
            }

            longest = Math.max(longest, a);
        }

        return longest;
    }

    static int longestValidParenthesesV2(String s) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        stack.push(-1);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();

                if (stack.isEmpty()) {
                    stack.push(i);
                }
                max = Math.max(max, i - stack.peek());
            }
        }

        return max;

    }

    static int longestValidParenthesesV3(String s) {
        int[] stack = new int[s.length() + 1];
        int top = -1;
        stack[++top] = -1;

        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack[++top] = i;
            } else {
                top--;

                if (top == -1) {
                    stack[++top] = i;
                }

                max = Math.max(max, i - stack[top]);
            }
        }

        return max;
    }

}

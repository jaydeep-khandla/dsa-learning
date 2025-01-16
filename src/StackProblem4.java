import java.util.Stack;

public class StackProblem4 {
    public static void main(String[] args) {
        int asteroids[] = { 5, 10, -5, 50, 10, -5, 20, -50, 40, -40 };
        int[] result = asteroidCollision(asteroids);

        printArray(result);
    }

    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

    static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] > 0) {
                stack.push(asteroids[i]);
            } else {
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(asteroids[i])) {
                    stack.pop();
                }

                if (!stack.isEmpty() && stack.peek() == Math.abs(asteroids[i])) {
                    stack.pop();
                } else if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(asteroids[i]);
                }
            }
        }

        int[] result = new int[stack.size()];
        int index = stack.size() - 1;

        while (!stack.isEmpty()) {
            result[index--] = stack.pop();
        }

        return result;
    }
}

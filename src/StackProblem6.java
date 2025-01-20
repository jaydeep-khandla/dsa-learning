import java.util.ArrayList;
import java.util.Stack;

public class StackProblem6 {
    public static void main(String[] args) {
        int arr[] = { 3, 8, 5, 2, 25 };

        // ArrayList<Integer> result = nextLargerElement(arr);

        // immediateSmaller(arr);

        // for (int i : arr) {
        // System.out.print(i + " ");
        // }

        int[] result = help_classmate(arr, arr.length);

        for (int i : result) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

    static ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here

        Stack<Integer> stack = new Stack<>();

        ArrayList<Integer> result = new ArrayList<>(arr.length);

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                result.add(0, -1);
            } else {
                result.add(0, stack.peek());
            }

            stack.push(arr[i]);
        }

        return result;
    }

    static void immediateSmaller(int arr[]) {
        // code here
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            // while (!stack.isEmpty() && stack.peek() >= arr[i]) {
            // stack.pop();
            // }

            if (stack.isEmpty()) {
                // System.out.print(-1 + " " + arr[i] + " ");
                stack.push(arr[i]);
                arr[i] = -1;
            } else if (stack.peek() < arr[i]) {
                // System.out.print(stack.peek() + " " + arr[i] + " ");
                int temp = arr[i];
                arr[i] = stack.peek();
                stack.push(temp);
            } else {
                // System.out.print(stack.peek() + " " + arr[i] + " ");
                stack.push(arr[i]);
                arr[i] = -1;
            }
        }
    }

    static int[] help_classmate(int arr[], int n) {
        // Your code goes here
        Stack<Integer> stack = new Stack<>();

        int[] result = new int[n];

        for (int i = n - 1; i >= 0; i--) {
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
}

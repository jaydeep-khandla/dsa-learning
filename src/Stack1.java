import java.util.Scanner;

public class Stack1 {

    /*
     * Stack:
     * 1. Stack is a linear data structure.
     * 2. Stack follows LIFO (Last In First Out) principle.
     * 3. Stack can be implemented using arrays.
     * 4. Basic operations: push(), pop(), peek(), isEmpty(), isFull()
     * 5. push() - adds an element to the stack.
     * 6. pop() - removes and returns the top element of the stack.
     * 7. peek() - returns the top element of the stack.
     * 8. isEmpty() - returns true if the stack is empty, else false.
     * 9. isFull() - returns true if the stack is full, else false.
     * 10. Time complexity: O(1) for all operations.
     * 11. Space complexity: O(n) where n is the size of the stack.
     * 12. Applications: function calls, undo mechanisms, back button in browsers.
     * 
     * Advantages:
     * 1. Fast access to elements.
     * 2. Easy to implement.
     * 
     * Disadvantages:
     * 1. Static size.
     * 2. Wastage of memory.
     * 3. If the stack is full, we cannot add more elements.
     * 4. If the stack is empty, we cannot remove elements.
     * 
     * Improvisations:
     * 1. Dynamic stack.
     * 2. Implement stack using linked list, ArrayList, Deque, Queue, two queues,
     * one queue.
     * 
     */

    int[] stack;
    int top;
    int size;

    /**
     * Constructs a new Stack1 with the specified size.
     *
     * @param n the size of the stack
     */
    public Stack1(int n) {
        stack = new int[n];
        top = -1;
        size = n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the stack: ");
        int n = sc.nextInt();

        Stack1 stack = new Stack1(n);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        stack.push(50);
        stack.push(60);
        stack.push(70);

        System.out.println(stack.peek());

        stack.printStack();

        sc.close();

    }

    public int size() {
        return top + 1;
    }

    public void push(int ele) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        } else {
            top++;
            stack[top] = ele;
            return;
        }
    }

    public int pop() {
        int val = peek();
        if (val != Integer.MIN_VALUE) {
            top--;
        }
        return val;
    }

    public int peek() {

        if (isEmpty()) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }

        return stack[top];
    }

    public boolean isEmpty() {
        return top <= -1;
    }

    public boolean isFull() {
        return top >= size - 1;
    }

    public void printStack() {

        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public int getMin() {
        int min = stack[top];
        for (int i = 0; i <= top; i++) {
            if (stack[i] < min) {
                min = stack[i];
            }
        }
        return min;
    }

    public int getMax() {
        int max = stack[top];
        for (int i = 0; i <= top; i++) {
            if (stack[i] > max) {
                max = stack[i];
            }
        }
        return max;
    }

}

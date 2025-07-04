import java.util.*;

/* Queue Implementation using Stacks
 * * This implementation uses two stacks to simulate the behavior of a queue.
 * The main operations are enqueue, dequeue, and peek.
 * * Enqueue adds an element to the end of the queue.
 * * Dequeue removes and returns the element at the front of the queue.
 * * Peek returns the element at the front of the queue without removing it.
 * 
 * * The enqueue operation can be done in two ways:
 *   - enqueue: Pushes the element onto the main stack.
 *   - enqueueV2: Reverses the order of elements to maintain queue order.
 * 
 * * The dequeue operation can also be done in two ways:
 *   - dequeue: Uses the reverse stack to maintain order.
 *   - dequeueV2: Pops from the main stack directly.
 * 
 * * The peek operation can be done in two ways:
 *  - peek: Uses the reverse stack to maintain order.
 *  - peekV2: Returns the top element of the main stack directly.
 * 
 * * Example usage:
 * QueueUsingStack queue = new QueueUsingStack();
 * queue.enqueue(1);
 * queue.enqueue(2);
 * queue.enqueue(3);
 * * System.out.println("Peek: " + queue.peek());
 * * System.out.println("Dequeue: " + queue.dequeue());
 * * System.out.println("Peek: " + queue.peek());
 * * Note: This implementation does not handle dynamic resizing of the stacks.
 * 
 */

public class QueueUsingStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> reverseStack = new Stack<>();

    public void enqueue(int val) {
        stack.push(val);
    }

    public void enqueueV2(int val) {
        if (stack.isEmpty()) {
            stack.push(val);
        } else {
            while (!stack.isEmpty()) {
                reverseStack.push(stack.pop());
            }
            stack.push(val);
            while (!reverseStack.isEmpty()) {
                stack.push(reverseStack.pop());
            }
        }
    }

    public int dequeue() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Queue is Empty");
        }

        while (!stack.isEmpty()) {
            reverseStack.push(stack.pop());
        }

        int val = reverseStack.pop();

        while (!reverseStack.isEmpty()) {
            stack.push(reverseStack.pop());
        }

        return val;
    }

    public int dequeueV2() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Queue is Empty");
        }

        return stack.pop();
    }

    public int peek() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Queue is Empty");
        }

        while (!stack.isEmpty()) {
            reverseStack.push(stack.pop());
        }

        int val = reverseStack.peek();

        while (!reverseStack.isEmpty()) {
            stack.push(reverseStack.pop());
        }

        return val;
    }

    public int peekV2() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Queue is Empty");
        }

        return stack.peek();
    }

    public static void main(String[] args) {

        QueueUsingStack queue = new QueueUsingStack();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Peek: " + queue.peek());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Peek: " + queue.peek());

    }   

}
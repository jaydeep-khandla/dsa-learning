import java.util.*;

/* 
 * Stack Implementation using Queues
 * 
 * This implementation uses two queues to simulate the behavior of a stack.
 * The main operations are push, pop, and peek.
 * 
 * Push adds an element to the top of the stack.
 * Pop removes and returns the element at the top of the stack.
 * Peek returns the element at the top of the stack without removing it.
 * * The push operation simply adds the element to the main queue.
 * * The pop operation transfers all elements except the last one to a temporary queue,
 * * then retrieves the last element as the top of the stack.
 * * The peek operation works similarly to pop but returns the last element without removing it.
 * 
 * Example usage:
 * StackUsingQueues stack = new StackUsingQueues();
 * stack.push(1);
 * stack.push(2);
 * stack.push(3);
 *  
 * System.out.println("Peek: " + stack.peek());
 * System.out.println("Pop: " + stack.pop());
 * System.out.println("Peek: " + stack.peek());
 * 
 * Note: This implementation does not handle dynamic resizing of the queues.
 */

public class StackUsingQueues {
    private Queue<Integer> mainQueue;
    private Queue<Integer> tempQueue;

    public StackUsingQueues() {
        mainQueue = new LinkedList<>();
        tempQueue = new LinkedList<>();
    }

    public void push(int value) {
        mainQueue.offer(value);
    }

    public int pop() {
        if (mainQueue.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        // Move elements to tempQueue except the last one
        while (mainQueue.size() > 1) {
            tempQueue.offer(mainQueue.poll());
        }

        // The last element is the top of the stack
        int poppedValue = mainQueue.poll();

        // Swap the queues
        Queue<Integer> temp = mainQueue;
        mainQueue = tempQueue;
        tempQueue = temp;

        return poppedValue;
    }

    public int peek() {
        if (mainQueue.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        // Move elements to tempQueue except the last one
        while (mainQueue.size() > 1) {
            tempQueue.offer(mainQueue.poll());
        }

        // The last element is the top of the stack
        int topValue = mainQueue.peek();

        // Move the last element to tempQueue
        tempQueue.offer(mainQueue.poll());

        // Swap the queues
        Queue<Integer> temp = mainQueue;
        mainQueue = tempQueue;
        tempQueue = temp;

        return topValue;
    }

    public boolean isEmpty() {
        return mainQueue.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Peek: " + stack.peek());
    }
}

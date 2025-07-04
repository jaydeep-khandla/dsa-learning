
/* Queue Implementation in Java
 * This code demonstrates a simple queue implementation using an array.
 * It includes methods to enqueue, dequeue, peek, check if the queue is empty or full,
 * and print the current state of the queue.
 * 
 * Queue is a First In First Out (FIFO) data structure.
 * Elements are added to the rear and removed from the front.
 * The queue has a fixed capacity, and if it is full, new elements cannot be added until some are removed.
 * If the queue is empty, attempting to dequeue or peek will throw an exception.
 * 
 * This implementation uses an array to store the elements of the queue.
 * The `enqueue` method adds an element to the rear of the queue,
 * while the `dequeue` method removes an element from the front.
 * The `peek` method allows you to view the front element without removing it.
 * The `isEmpty` and `isFull` methods check the state of the queue.
 * The `printQueue` method displays the current elements in the queue.
 * The main method demonstrates the usage of the queue with various operations.
 * Note: This implementation does not handle dynamic resizing of the queue.
 * If the queue is full, an exception is thrown when trying to enqueue a new element.
 *
 * Example usage:
 * QueueExplain queue = new QueueExplain(5);
 * queue.enqueue(1);
 * queue.enqueue(2);
 * System.out.println(queue.dequeue()); // Outputs: 1
 * System.out.println(queue.peek());    // Outputs: 2
 * queue.printQueue(); // Outputs: 2
 * queue.enqueue(3);
 * queue.enqueue(4);
 * queue.enqueue(5);
 * queue.enqueue(6); // Throws exception: Queue is Full
 */

public class QueueExplain {

    int rear;
    int front;
    int size;
    int capacity;
    int queue[];

    public QueueExplain(int capacity) {
        queue = new int[capacity];
        this.capacity = capacity;

        size = 0;
        rear = front = -1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return rear == capacity - 1;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is Empty.");
        }

        return queue[front];
    }

    public void enqueue(int val) {
        if (isFull()) {
            throw new IllegalStateException("Queue is Full");
        }

        if (isEmpty()) {
            front = 0;
        }

        queue[++rear] = val;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is Empty.");
        }
        int val = queue[front];
        if (front == rear) {
            // Reset queue when last element is dequeued
            front = -1;
            rear = -1;
        } else {
            front++;
        }
        return val;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueExplain queue = new QueueExplain(5);

        System.out.println("Is Queue Empty? " + queue.isEmpty());
        System.out.println("Is Queue Full? " + queue.isFull());
        try {
            queue.dequeue(); // This will throw an exception since the queue is empty
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Enqueuing elements to the queue:");
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println("Front: " + queue.front);
        System.out.println("Rear: " + queue.rear);
        try {
            queue.enqueue(6); // This will throw an exception since the queue is full
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
        queue.printQueue();
        System.out.println("Dequeueing elements from the queue:");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.printQueue();
        System.out.println("Peek at the front element: " + queue.peek());
        System.out.println("Is Queue Empty? " + queue.isEmpty());
        System.out.println("Is Queue Full? " + queue.isFull());

        System.out.println("Front: " + queue.front);
        System.out.println("Rear: " + queue.rear);
        queue.enqueue(6);
        queue.printQueue();
        System.out.println("Final Queue State:");
        queue.printQueue();
        System.out.println("Peek at the front element: " + queue.peek());
        System.out.println("Is Queue Empty? " + queue.isEmpty());
        System.out.println("Is Queue Full? " + queue.isFull());
    }
}

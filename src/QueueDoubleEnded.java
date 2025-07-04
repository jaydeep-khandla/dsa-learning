
/* 
 * Double Ended Queue (Deque) Implementation in Java
 * This code demonstrates a double-ended queue (deque) implementation using an array.
 * It includes methods to enqueue and dequeue elements from both the front and rear,
 * peek at the front element, check if the queue is empty or full, and print the
 * current state of the queue.
 * * A double-ended queue allows insertion and deletion of elements from both ends,
 * making it more flexible than a standard queue.
 * Elements can be added to the front or rear and removed from either end.
 * This implementation uses an array to store the elements of the queue.
 * The `enqueueRear` method adds an element to the rear of the queue,
 * while the `enqueueFront` method adds an element to the front.
 * The `dequeueFront` method removes an element from the front,
 * and the `dequeueRear` method removes an element from the rear.
 * The `peek` method allows you to view the front element without removing it.
 * The `isEmpty` and `isFull` methods check the state of the queue.
 * The `printQueue` method displays the current elements in the queue.
 * The main method demonstrates the usage of the double-ended queue with various operations.
 * Note: This implementation does not handle dynamic resizing of the queue.
 * If the queue is full, an exception is thrown when trying to enqueue a new element.
 * 
 * Example usage:
 * QueueDoubleEnded queue = new QueueDoubleEnded(5);
 * queue.enqueueRear(1);
 * queue.enqueueRear(2);
 * queue.enqueueFront(0);
 * queue.enqueueRear(3);
 * queue.enqueueFront(-1);
 *  System.out.println("Queue after enqueuing elements:");
 * queue.printQueue();
 * System.out.println("Dequeue from front: " + queue.dequeueFront());
 * System.out.println("Dequeue from rear: " + queue.dequeueRear());
 * System.out.println("Queue after dequeuing elements:");
 * queue.printQueue();
 * 
 * Note: This implementation does not handle dynamic resizing of the queue.
 */

public class QueueDoubleEnded {
    int rear;
    int front;
    int size;
    int capacity;
    int queue[];

    public QueueDoubleEnded(int capacity) {
        queue = new int[capacity];
        this.capacity = capacity;

        size = 0;
        rear = front = -1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is Empty.");
        }
        return queue[front];
    }

    public void enqueueRear(int val) {
        if (isFull()) {
            throw new IllegalStateException("Queue is Full");
        }

        if (isEmpty()) {
            front = 0;
        }

        rear = (rear + 1) % capacity; // Circular increment
        queue[rear] = val;
        size++;
    }

    public void enqueueFront(int val) {
        if (isFull()) {
            throw new IllegalStateException("Queue is Full");
        }

        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            front = (front - 1 + capacity) % capacity; // Circular decrement
        }

        queue[front] = val;
        size++;
    }

    public int dequeueFront() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is Empty.");
        }

        int val = queue[front];

        if (front == rear) {
            // Reset queue when last element is dequeued
            front = -1;
            rear = -1;
            size = 0;
        } else {
            front = (front + 1) % capacity; // Circular increment
        }

        return val;
    }

    public int dequeueRear() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is Empty.");
        }

        int val = queue[rear];

        if (front == rear) {
            // Reset queue when last element is dequeued
            front = -1;
            rear = -1;
            size = 0;
        } else {
            rear = (rear - 1 + capacity) % capacity; // Circular decrement
        }

        return val;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front; i != rear; i = (i + 1) % capacity) {
            System.out.print(queue[i] + " ");
        }
        System.out.print(queue[rear]); // Print the last element
        System.out.println();
    }

    public static void main(String[] args) {
        QueueDoubleEnded queue = new QueueDoubleEnded(5);
        queue.enqueueRear(1);
        queue.enqueueRear(2);
        queue.enqueueFront(0);
        queue.enqueueRear(3);
        queue.enqueueFront(-1);

        System.out.println("Queue after enqueuing elements:");
        queue.printQueue();

        System.out.println("Dequeue from front: " + queue.dequeueFront());
        System.out.println("Dequeue from rear: " + queue.dequeueRear());

        System.out.println("Queue after dequeuing elements:");
        queue.printQueue();
    }
}

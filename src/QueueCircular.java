
/* 
 * Circular Queue Implementation in Java
 * This code demonstrates a circular queue implementation using an array.
 * It includes methods to enqueue, dequeue, peek, check if the queue is empty or full,
 * and print the current state of the queue.
 *
 * Circular Queue is a variation of the standard queue that connects the end of the queue back to the front,
 * forming a circle. This allows for more efficient use of space, as elements can be added and removed
 * from any position in the queue without the need to shift other elements.
 * Elements are added to the rear and removed from the front, similar to a standard queue.
 * However, in a circular queue, when the rear reaches the end of the array, it wraps around to the beginning if there is space.
 * This eliminates the need for shifting elements and allows for more efficient use of the array.
 * 
 * Example usage:
 * QueueCircular queue = new QueueCircular(5);
 * queue.enqueue(1);
 * queue.enqueue(2);
 * System.out.println(queue.dequeue()); // Outputs: 1
 * System.out.println(queue.dequeue()); // Outputs: 2
 * System.out.println(queue.dequeue()); // Outputs: 3
 * queue.printQueue(); // Outputs: 4 5
 * queue.enqueue(6);
 * queue.printQueue(); // Outputs: 4 5 6
 * queue.enqueue(7); // Throws exception: Queue is Full
 * Note: This implementation does not handle dynamic resizing of the queue.
 */

public class QueueCircular {
    int rear;
    int front;
    int size;
    int capacity;
    int queue[];

    public QueueCircular(int capacity) {
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

    public void enqueue(int val) {
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

    public int dequeue() {
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
            size--;
        }
        
        return val;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        
        System.out.println();
    }

    public static void main(String[] args) {
        QueueCircular queue = new QueueCircular(5);
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

        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());

        queue.printQueue();

        System.out.println("Peek at the front element: " + queue.peek());
        System.out.println("Is Queue Empty? " + queue.isEmpty());
        System.out.println("Is Queue Full? " + queue.isFull());

        System.out.println("Front: " + queue.front);
        System.out.println("Rear: " + queue.rear);

        queue.enqueue(6);
        queue.printQueue();
    }
}

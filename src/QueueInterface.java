import java.util.*;

/*
 * Java Collection Framework: Queue, Deque, LinkedList, ArrayDeque, PriorityQueue
 *
 * This documentation explains the use of Queue and Deque interfaces and their
 * commonly used implementations: LinkedList, ArrayDeque, and PriorityQueue.
 *
 * Queue:
 * - A collection designed for holding elements prior to processing.
 * - Follows the First-In-First-Out (FIFO) principle.
 * - Does not allow null elements in some implementations (e.g., ArrayDeque, PriorityQueue).
 * - Interface introduced in Java 1.5 (part of java.util).
 * - Methods return special values (null/false) instead of throwing exceptions.
 *
 * Common Queue Methods:
 * - offer(E e): Inserts the specified element into the queue if possible.
 * - poll(): Retrieves and removes the head of the queue, or returns null if empty.
 * - peek(): Retrieves, but does not remove, the head of the queue, or returns null if empty.
 * - add(E e): Inserts the element, throws IllegalStateException if capacity is exceeded.
 * - remove(): Retrieves and removes the head of the queue; throws NoSuchElementException if empty.
 * - element(): Retrieves, but does not remove, the head; throws NoSuchElementException if empty.
 *
 * Common Implementations of Queue:
 *
 * 1. LinkedList (also implements Deque):
 *    - Implements both Queue and Deque interfaces.
 *    - Can be used for FIFO (queue) or LIFO (stack) operations.
 *    - Allows null elements.
 *
 * 2. ArrayDeque:
 *    - Resizable-array implementation of Deque.
 *    - Faster than LinkedList for both stack and queue operations.
 *    - Does not allow null elements.
 *    - Not thread-safe.
 *
 * 3. PriorityQueue:
 *    - Implements Queue with elements ordered according to their natural ordering
 *      or a provided Comparator.
 *    - Not thread-safe.
 *    - Allows duplicates but does not permit null elements.
 *    - Use when priority-based ordering is needed.
 *    - PriorityQueue is implemented using a heap. By default, it's a min-heap.
 *
 *
 * Deque (Double-Ended Queue):
 * - A linear collection that supports insertion and removal at both ends.
 * - Can be used as a stack (LIFO) or a queue (FIFO).
 * - Introduced in Java 1.6 (java.util.Deque interface).
 * - Extends Queue interface.
 *
 * Common Deque Methods:
 * - addFirst(E e), addLast(E e): Inserts element at the front or end.
 * - removeFirst(), removeLast(): Removes and returns the first or last element.
 * - getFirst(), getLast(): Retrieves but does not remove the first or last element.
 * - offerFirst(E e), offerLast(E e): Inserts element at front or end; returns false if capacity exceeded.
 * - pollFirst(), pollLast(): Retrieves and removes the first or last element.
 * - peekFirst(), peekLast(): Retrieves but does not remove the first or last element.
 * - push(E e): Same as addFirst(); used for stack behavior.
 * - pop(): Same as removeFirst(); used for stack behavior.
 *
 * Common Implementations of Deque:
 *
 * 1. LinkedList:
 *    - Implements Deque as a doubly-linked list.
 *    - Allows null elements.
 *    - Ideal for frequent insertions/removals from both ends.
 *
 * 2. ArrayDeque:
 *    - Resizable array implementation of Deque.
 *    - Does not allow null elements.
 *    - More efficient than LinkedList for stack/queue use.
 *
 *
 * Usage Summary:
 * - Use Queue for FIFO operations such as task scheduling.
 * - Use PriorityQueue when elements must be processed by priority.
 * - Use Deque for both stack and queue behaviors.
 * - Prefer ArrayDeque over Stack and LinkedList in most cases for stack/queue operations.
 */

public class QueueInterface {
    public static void main(String[] args) {
        // Queue<Integer> queue = new ArrayDeque<>();
        // Queue<Integer> queue = new LinkedList<>();

        // Deque<Integer> queue = new ArrayDeque<>();

        // queue.offer(10);
        // queue.offer(20);
        // queue.offer(30);
        // queue.offer(40);
        // queue.offer(50);
        // System.out.println(queue);
        // queue.offerFirst(60);
        // queue.offerLast(70);
        // System.out.println(queue);
        // System.out.println(queue.peek());
        // System.out.println(queue.poll());
        // System.out.println(queue.pollFirst());
        // System.out.println(queue.pollLast());
        // System.out.println(queue);

        // PriorityQueue<Integer> queue = new PriorityQueue<>(); // Min Heap
        // PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder()); // Max Heap
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder()); // Max Heap
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50) ;
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}

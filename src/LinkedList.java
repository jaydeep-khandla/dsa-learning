/**
 * A simple implementation of a singly linked list in Java.
 * 
 * A Linked List is a linear data structure where each element (called a node)
 * contains two parts: data and a reference (or link) to the next node in the
 * sequence.
 * Unlike arrays, linked lists do not require contiguous memory allocation,
 * making them efficient for dynamic memory usage and insertions/deletions.
 * 
 * Key characteristics of this implementation:
 * 
 * 1. Node Class:
 * - A generic class that holds the data and a reference to the next node.
 * - In this case, it is used with Integer type (Node<Integer>).
 * 
 * 2. LinkedList Class:
 * - Manages the nodes starting from the head node.
 * - Maintains a size variable to keep track of the number of elements.
 * 
 * 3. Core Operations:
 * - insertAtHead(int data): Inserts a new node at the beginning of the list.
 * - insertAtTail(int data): Inserts a new node at the end of the list.
 * - insertAtPosition(int data, int position): Inserts a node at a specific
 * position (1-based index).
 * - deleteAtHead(): Removes the first node and returns its value.
 * - deleteAtTail(): Removes the last node and returns its value.
 * - deleteAtPosition(int position): Removes a node from a specific position.
 * - getSize(): Returns the current size of the linked list.
 * - printList(): Prints the entire list in a readable format.
 * 
 * 4. Error Handling:
 * - Throws IllegalStateException if operations are attempted with invalid
 * positions or on empty lists.
 * 
 * 5. Efficiency Considerations:
 * - Insertions/deletions at head are O(1).
 * - Insertions/deletions at tail or arbitrary positions require traversal and
 * are O(n).
 * 
 * Usage:
 * - Linked lists are useful when you need dynamic data structures with frequent
 * insertions
 * and deletions, especially when the total size is unknown or changes often.
 * 
 * This implementation is singly linked (each node points only to the next
 * node).
 * Variations include doubly linked lists, where nodes also point to the
 * previous node,
 * allowing bidirectional traversal.
 */

class Node<T> {
    T data;
    Node<T> next;

    Node() {
        this.next = null;
    }

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node<Integer> head;
    int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void insertAtHead(int data) {
        Node<Integer> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void insertAtPosition(int data, int position) {
        if (position <= 0) {
            throw new IllegalStateException("Position cannot be zero or negative");
        }

        if (position > size + 1) {
            throw new IllegalStateException("Position out of bounds");
        }

        Node<Integer> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
            return;
        }

        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        } else if (position == size + 1) {
            insertAtTail(data);
            return;
        }

        Node<Integer> current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
        size++;
        return;
    }

    public void insertAtTail(int data) {
        Node<Integer> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        Node<Integer> current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        size++;
    }

    public int getSize() {
        return size;
    }

    public int deleteAtHead() {
        if (head == null) {
            throw new IllegalStateException("List is empty.");
        }
        int deletedValue = head.data;
        Node<Integer> deletedNode = head;

        head = head.next;
        size--;

        deletedNode.next = null; // Help with garbage collection
        deletedNode.data = null; // Help with garbage collection

        return deletedValue;
    }

    public int deleteAtTail() {
        if (head == null) {
            throw new IllegalStateException("List is empty.");
        }

        if (head.next == null) {
            int deletedValue = head.data;
            head = null;
            size--;
            return deletedValue;
        }

        Node<Integer> current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        int deletedValue = current.next.data;
        Node<Integer> deletedNode = current.next;

        current.next = null;
        size--;

        deletedNode.next = null; // Help with garbage collection
        deletedNode.data = null; // Help with garbage collection

        return deletedValue;
    }

    public int deleteAtPosition(int position) {
        if (position <= 0) {
            throw new IllegalStateException("Position cannot be zero or negative");
        }

        if (position > size) {
            throw new IllegalStateException("Position out of bounds");
        }

        if (position == 1) {
            return deleteAtHead();
        } else if (position == size) {
            return deleteAtTail();
        }

        Node<Integer> current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        int deletedValue = current.next.data;
        Node<Integer> deletedNode = current.next;

        current.next = current.next.next;
        size--;

        deletedNode.next = null; // Help with garbage collection
        deletedNode.data = null; // Help with garbage collection

        return deletedValue;
    }

    public void printList() {
        Node<Integer> current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtHead(10);
        list.insertAtTail(20);
        list.insertAtPosition(15, 2);
        list.insertAtPosition(5, 1);
        list.printList();
    }
}

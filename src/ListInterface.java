import java.util.*;

/*
 * Java Collection Framework: List, ArrayList, LinkedList, Vector, Stack
 *
 * This program demonstrates the use of the List interface and its commonly used
 * implementations: ArrayList, LinkedList, Vector, and Stack.
 *
 * List:
 * - An ordered collection (also known as a sequence).
 * - Allows duplicate elements.
 * - Elements can be accessed by their integer index (position in the list).
 * - Common implementations: ArrayList, LinkedList, Vector, Stack.
 *
 * ArrayList:
 * - Implements the List interface using a dynamically resizable array.
 * - Provides fast random access (O(1) time for get/set).
 * - Slower for insertions/deletions in the middle (O(n) time).
 * - Not synchronized (not thread-safe).
 * - Preferred when frequent access operations are required in single-threaded environments.
 *
 * Unique Methods in ArrayList:
 * - ensureCapacity(int minCapacity): Increases the capacity of the ArrayList if needed.
 * - trimToSize(): Trims the capacity of the ArrayList to the current size.
 * - clone(): Creates a shallow copy of the ArrayList.
 *
 * LinkedList:
 * - Implements the List and Deque interfaces using a doubly-linked list.
 * - Slower access time (O(n)) compared to ArrayList.
 * - Faster insertions and deletions, especially at the beginning or middle of the list.
 * - Supports queue and deque operations.
 *
 * Unique Methods in LinkedList:
 * - addFirst(E e), addLast(E e): Inserts elements at the beginning/end of the list.
 * - getFirst(), getLast(): Retrieves first/last elements.
 * - removeFirst(), removeLast(): Removes and returns first/last elements.
 * - offerFirst(E e), offerLast(E e): Adds elements at head or tail without exceptions.
 * - peekFirst(), peekLast(): Retrieves head or tail without removing them.
 *
 * Vector:
 * - Implements the List interface using a dynamic array (like ArrayList).
 * - Synchronized (thread-safe), which makes it slower in single-threaded use.
 * - Grows by doubling size when needed.
 * - Considered legacy but still used in multi-threaded contexts.
 *
 * Unique Methods in Vector:
 * - addElement(E obj): Adds the element to the end.
 * - removeElement(Object obj): Removes the first occurrence of the object.
 * - insertElementAt(E obj, int index): Inserts an element at the specified index.
 * - elementAt(int index): Returns the element at the specified index.
 * - firstElement(), lastElement(): Returns the first/last element.
 * - capacity(): Returns the current capacity of the Vector.
 * - copyInto(Object[] anArray): Copies the components into the specified array.

 * Stack:
 * - A subclass of Vector that implements a LIFO (Last-In-First-Out) stack.
 * - Legacy class, still used but often replaced with Deque-based structures.
 *
 * Unique Methods in Stack:
 * - push(E item): Pushes an item onto the top of the stack.
 * - pop(): Removes and returns the top item.
 * - peek(): Returns the top item without removing it.
 * - empty(): Checks if the stack is empty.
 * - search(Object o): Returns the 1-based position from the top of the stack.
 *
 * Usage Summary:
 * - Use List for general-purpose, ordered collection handling.
 * - ArrayList: Best for frequent access, less insertion/deletion.
 * - LinkedList: Best for frequent insertion/deletion at both ends.
 * - Vector: Thread-safe alternative to ArrayList (legacy).
 * - Stack: LIFO behavior; use Deque instead in modern code.
 */


public class ListInterface {

    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<Integer>();
//        List<Integer> linklist = new LinkList<Integer>();
//
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(5);
//
//        System.out.println(list);
//
//        list.remove(1);
//        System.out.println(list);
//
//        list.remove(Integer.valueOf(5));
//        System.out.println(list);
//
//        System.out.println(list.contains(2));
//
//        for (Integer integer : list) {
//            System.out.println(integer);
//        }
//
//        list.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;
//            }
//        });
//
//        System.out.println(list);7

//        List<Student> students = new ArrayList<>();
//
//        students.add(new Student(1, "Ramesh"));
//        students.add(new Student(1, "Suresh"));
//        students.add(new Student(1, "Kamlesh"));
//
//        Comparator<Student> comparator = new Comparator<Student>() {
//            public int compare(Student s1, Student s2) {
//                int res = s1.id-s2.id;
//
//                return res != 0 ? res : s1.name.compareTo(s2.name);
//            }
//        };
//
//        students.sort(comparator);
//
//        Iterator<Student> iterator = students.iterator();
//        ListIterator<Student> iterator2 = students.listIterator();
//
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//
//        while (iterator2.hasNext()) {
//            System.out.println(iterator2.next());
//        }

      // Example:
      CollectionDemo demo = new CollectionDemo();

      demo.run(args);
    }
}

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

// Example:
class CollectionDemo {

    public static void run(String[] args) {
        // 1. ArrayList Demo
        System.out.println("=== ArrayList ===");
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.ensureCapacity(10);  // Unique method
        arrayList.trimToSize();        // Unique method
        System.out.println("ArrayList: " + arrayList);
        System.out.println("Element at index 1: " + arrayList.get(1));

        // 2. LinkedList Demo
        System.out.println("\n=== LinkedList ===");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("First");  // Unique method
        linkedList.addLast("Last");    // Unique method
        linkedList.add("Middle");
        System.out.println("LinkedList: " + linkedList);
        System.out.println("First Element: " + linkedList.getFirst()); // Unique method
        System.out.println("Last Element: " + linkedList.getLast());   // Unique method
        linkedList.removeFirst();      // Unique method
        linkedList.removeLast();       // Unique method
        System.out.println("After removing first and last: " + linkedList);

        // 3. Vector Demo
        System.out.println("\n=== Vector ===");
        Vector<String> vector = new Vector<>();
        vector.addElement("One");        // Unique method
        vector.addElement("Two");
        vector.insertElementAt("Zero", 0); // Unique method
        System.out.println("Vector: " + vector);
        System.out.println("First Element: " + vector.firstElement()); // Unique method
        System.out.println("Capacity: " + vector.capacity());          // Unique method
        vector.removeElement("Two");     // Unique method
        System.out.println("After removal: " + vector);

        // 4. Stack Demo
        System.out.println("\n=== Stack ===");
        Stack<String> stack = new Stack<>();
        stack.push("Bottom");           // Unique method
        stack.push("Middle");
        stack.push("Top");
        System.out.println("Stack: " + stack);
        System.out.println("Peek (top element): " + stack.peek());     // Unique method
        System.out.println("Pop (remove top): " + stack.pop());        // Unique method
        System.out.println("Is stack empty? " + stack.empty());        // Unique method
        System.out.println("Search 'Bottom': " + stack.search("Bottom")); // Unique method
        System.out.println("Final Stack: " + stack);
    }
}

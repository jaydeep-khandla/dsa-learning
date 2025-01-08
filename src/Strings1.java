public class Strings1 {
    public static void main(String[] args) {
        /*
         * Strings:
         * 
         * - A string is a sequence of characters.
         * - In Java, strings are objects of the String class.
         * - Strings are immutable i.e., the value of a string cannot be changed once
         * it is created.
         * - Strings are stored in the string pool.
         * - Strings can be created using string literals or the new keyword.
         * 
         * When creating string literals, the JVM checks the string pool for the
         * existence of the string. If it exists, the reference to the existing string
         * is returned.
         * 
         * - The string pool is a special area in the heap memory that stores string
         * literals.
         * - The string pool is created in the PermGen (Permanent Generation) space of
         * the heap memory.
         * - The string pool is created when the JVM starts up.
         * 
         * * The string pool is used to:
         * - store unique string literals.
         * - reduce memory usage.
         * - increase performance.
         * - improve security.
         * 
         * When creating strings using the new keyword, a new object is created in the
         * heap memory.
         * 
         */

        // String name1 = "John";
        // String name2 = "John";
        // String name3 = "John";
        // String name4 = "John";
        // System.out.println(name1 == name2); // true
        // System.out.println(name1 == name3); // true
        // System.out.println(name1 == name4); // true

        // // new keyword creates a new object in the heap memory
        // String name5 = new String("John");
        // String name6 = new String("John");
        // String name7 = new String("John");
        // String name8 = new String("John");
        // String name9 = name5;
        // System.out.println(name5 == name6); // false
        // System.out.println(name5 == name7); // false
        // System.out.println(name5 == name8); // false
        // System.out.println(name5 == name9); // true

        /*
         * String Builder:
         * 
         * - The StringBuilder class is used to create mutable (modifiable) string
         * objects.
         * - The StringBuilder class is similar to the StringBuffer class.
         * - The StringBuilder class is not synchronized.
         * - The StringBuilder class is faster than the StringBuffer class.
         * - The StringBuilder class was introduced in Java 5.
         * 
         * StringBuilder methods:
         * 
         * - append(): appends the specified string to the end of the current string.
         * - insert(): inserts the specified string at the specified position.
         * - replace(): replaces the characters in a substring with the specified
         * string.
         * - delete(): deletes the characters in a substring.
         * - reverse(): reverses the characters in the current string.
         * - capacity(): returns the current capacity of the StringBuilder object.
         * - ensureCapacity(): ensures that the capacity is at least equal to the
         * specified minimum.
         * - length(): returns the length (number of characters) of the current string.
         * - setLength(): sets the length of the current string.
         * - charAt(): returns the character at the specified index.
         * - indexOf(): returns the index of the first occurrence of the specified
         * string.
         * 
         * StringBuilder constructors:
         * 
         * - StringBuilder(): creates an empty string builder with the default initial
         * capacity (16).
         * - StringBuilder(int capacity): creates an empty string builder with the
         * specified initial capacity.
         * - StringBuilder(String str): creates a string builder with the specified
         * string.
         * 
         * StringBuilder example:
         * 
         * StringBuilder sb = new StringBuilder(); sb.append("Hello");
         * sb.append("World"); System.out.println(sb); // HelloWorld
         * 
         * StringBuilder sb = new StringBuilder("Hello"); sb.append("World");
         * System.out.println(sb); // HelloWorld
         * 
         * StringBuilder sb = new StringBuilder("Hello"); sb.insert(5, "World");
         * 
         * System.out.println(sb); // HelloWorld
         * 
         */

        // StringBuilder name1 = new StringBuilder("Jaydeep");
        // StringBuilder name2 = new StringBuilder("Jaydeep");
        // StringBuilder name3 = new StringBuilder("Jaydeep");
        // StringBuilder name4 = name1;

        // System.out.println(name1.equals(name2)); // false
        // System.out.println(name1.equals(name3)); // false
        // System.out.println(name1.equals(name4)); // true
        // System.out.println(name2.equals(name3)); // false
        // System.out.println(name2.equals(name4)); // false
        // System.out.println(name3.equals(name4)); // false

        // name4.append(" Khandla");

        // System.out.println("------------------------------------");

        // System.out.println(name1.equals(name2)); // false
        // System.out.println(name1.equals(name3)); // false
        // System.out.println(name1.equals(name4)); // true
        // System.out.println(name2.equals(name3)); // false
        // System.out.println(name2.equals(name4)); // false
        // System.out.println(name3.equals(name4)); // false

        // System.out.println(name1); // Jaydeep Khandla
        // System.out.println(name2); // Jaydeep
        // System.out.println(name3); // Jaydeep
        // System.out.println(name4); // Jaydeep Khandla

        /*
         * String Buffer:
         * 
         * - The StringBuffer class is used to create mutable (modifiable) string
         * objects.
         * - The StringBuffer class is similar to the StringBuilder class.
         * - The StringBuffer class is synchronized.
         * - The StringBuffer class is slower than the StringBuilder class.
         * - The StringBuffer class was introduced in Java 1.0.
         * 
         * StringBuffer methods:
         * 
         * - append(): appends the specified string to the end of the current string.
         * - insert(): inserts the specified string at the specified position.
         * - replace(): replaces the characters in a substring with the specified
         * string.
         * - delete(): deletes the characters in a substring.
         * - reverse(): reverses the characters in the current string.
         * - capacity(): returns the current capacity of the StringBuffer object.
         * - ensureCapacity(): ensures that the capacity is at least equal to the
         * specified minimum.
         * - length(): returns the length (number of characters) of the current string.
         * - setLength(): sets the length of the current string.
         * 
         * StringBuffer constructors:
         * 
         * - StringBuffer(): creates an empty string buffer with the default initial
         * capacity (16).
         * - StringBuffer(int capacity): creates an empty string buffer with the
         * specified initial capacity.
         * - StringBuffer(String str): creates a string buffer with the specified
         * string.
         * 
         * StringBuffer example:
         * 
         * StringBuffer sb = new StringBuffer(); sb.append("Hello");
         * sb.append("World"); System.out.println(sb); // HelloWorld
         * 
         */

        StringBuffer name1 = new StringBuffer("Jaydeep");
        StringBuffer name2 = new StringBuffer("Jaydeep");
        StringBuffer name3 = new StringBuffer("Jaydeep");
        StringBuffer name4 = name1;

        System.out.println(name1.equals(name2)); // false
        System.out.println(name1.equals(name3)); // false
        System.out.println(name1.equals(name4)); // true
        System.out.println(name2.equals(name3)); // false
        System.out.println(name2.equals(name4)); // false
        System.out.println(name3.equals(name4)); // false

        name4.append(" Khandla");

        System.out.println("------------------------------------");

        System.out.println(name1.equals(name2)); // false
        System.out.println(name1.equals(name3)); // false
        System.out.println(name1.equals(name4)); // true
        System.out.println(name2.equals(name3)); // false
        System.out.println(name2.equals(name4)); // false
        System.out.println(name3.equals(name4)); // false

    }

}

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

        String name1 = "John";
        String name2 = "John";
        String name3 = "John";
        String name4 = "John";
        System.out.println(name1 == name2); // true
        System.out.println(name1 == name3); // true
        System.out.println(name1 == name4); // true

        // new keyword creates a new object in the heap memory
        String name5 = new String("John");
        String name6 = new String("John");
        String name7 = new String("John");
        String name8 = new String("John");
        String name9 = name5;
        System.out.println(name5 == name6); // false
        System.out.println(name5 == name7); // false
        System.out.println(name5 == name8); // false
        System.out.println(name5 == name9); // true
    }

}

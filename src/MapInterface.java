import java.util.*;

/*
 * Java Collection Framework: Map, HashMap, LinkedHashMap, TreeMap, Hashtable, EnumMap, WeakHashMap, IdentityHashMap
 *
 * This documentation explains the use of the Map interface and its most commonly
 * used implementations. Maps represent key-value pair collections and are part
 * of java.util package.
 *
 * Map:
 * - An object that maps keys to values.
 * - Keys must be unique; each key can map to at most one value.
 * - Not part of the Collection hierarchy (it is a separate root interface).
 * - Allows querying, updating, removing, and iterating over mappings.
 * - Allows null values and, depending on implementation, null keys.
 *
 * Common Map Methods:
 * - put(K key, V value): Associates the specified value with the specified key.
 * - get(Object key): Returns the value to which the key is mapped, or null if not found.
 * - remove(Object key): Removes the key-value pair for the specified key.
 * - containsKey(Object key), containsValue(Object value): Checks presence.
 * - keySet(), values(), entrySet(): Returns views of keys, values, or key-value pairs.
 * - isEmpty(), size(), clear(): Utility operations.
 *
 *
 * 1. HashMap:
 * - Implements Map using a hash table.
 * - Allows one null key and multiple null values.
 * - No guaranteed order of keys (unordered).
 * - Offers constant-time performance for basic operations (put, get, remove), assuming hash function disperses elements properly.
 * - Not synchronized (not thread-safe); use Collections.synchronizedMap() or ConcurrentHashMap for thread safety.
 *
 * Unique Features in HashMap:
 * - loadFactor: A measure of how full the map can get before resizing.
 * - initialCapacity: The capacity at the time of creation.
 *
 *
 * 2. LinkedHashMap:
 * - Extends HashMap and maintains a doubly-linked list running through its entries.
 * - Maintains insertion order or access order (if accessOrder flag is true).
 * - Slightly slower than HashMap but useful when ordering is required.
 *
 * Unique Features in LinkedHashMap:
 * - predictable iteration order.
 * - access-order mode useful for building LRU (Least Recently Used) caches.
 *
 * Constructor Example:
 * - new LinkedHashMap<>(initialCapacity, loadFactor, accessOrder);
 *
 *
 * 3. TreeMap:
 * - Implements Map using a Red-Black tree (self-balancing binary search tree).
 * - Keys are sorted in natural order or by a specified Comparator.
 * - Does not allow null keys (throws NullPointerException).
 * - Allows multiple null values.
 * - Slower than HashMap (O(log n) time for put/get/remove).
 * - Useful when sorted key traversal is needed.
 *
 * Unique Methods in TreeMap:
 * - firstKey(), lastKey(): Get lowest/highest key.
 * - higherKey(K key), lowerKey(K key): Get closest greater/lesser keys.
 * - subMap(), headMap(), tailMap(): Returns views over ranges of keys.
 * - comparator(): Returns the comparator used for ordering, or null for natural order.
 *
 *
 * 4. Hashtable (Legacy):
 * - Synchronized version of HashMap.
 * - Does not allow null keys or null values.
 * - Slower performance compared to modern alternatives.
 * - Considered obsolete; prefer ConcurrentHashMap for thread safety.
 *
 * Unique Methods in Hashtable:
 * - elements(): Legacy method returning Enumeration of values.
 * - keys(): Legacy method returning Enumeration of keys.
 *
 *
 * 5. EnumMap:
 * - Specialized Map implementation for use with enum keys.
 * - Internally represented as arrays.
 * - Extremely fast and compact when used with enum keys.
 * - All keys must belong to a single enum type (specified at construction).
 * - Maintains the natural order of enum constants.
 *
 * Constructor Example:
 * - new EnumMap<>(EnumType.class);
 *
 *
 * 6. WeakHashMap:
 * - Uses weak references for keys.
 * - Keys that are no longer referenced elsewhere are automatically garbage collected.
 * - Useful for implementing memory-sensitive caches.
 *
 * Behavior:
 * - Entries are removed automatically when key is weakly reachable (no strong refs).
 *
 *
 * 7. IdentityHashMap:
 * - Uses reference-equality (==) instead of object-equality (equals()) for comparing keys.
 * - Useful when identity comparison is desired (e.g., caching interned strings).
 * - Allows null keys and values.
 * - Not ordered.
 *
 *
 * Usage Summary:
 * - Use HashMap for general-purpose key-value storage (fast, flexible).
 * - Use LinkedHashMap when predictable iteration order is needed.
 * - Use TreeMap when sorted order of keys is required.
 * - Use EnumMap for high-performance enum-keyed maps.
 * - Use WeakHashMap for memory-sensitive mappings.
 * - Use IdentityHashMap when reference-based key comparison is necessary.
 * - Avoid Hashtable; prefer modern alternatives.
 */

public class MapInterface {
    public static void main(String[] args) {
        // Map<Integer, String> map = new HashMap<>();
        // Map<Integer, String> map = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        /*
         * map.put(1, "jd");
         * map.put(2, "jy");
         * map.put(3, "jy");
         * map.put(4, "jy");
         * map.put(5, "jy");
         * map.put(6, "jy");
         * map.put(7, "jy");
         * map.put(8, "jy");
         * map.put(9, "jy");
         * map.put(10, "jy");
         *
         * map.putIfAbsent(1, "jy");
         * System.out.println(map);
         *
         * System.out.println(map.get(1));
         * System.out.println(map.get(11));
         * System.out.println(map.getOrDefault(11, "Not Found"));
         *
         * System.out.println(map.containsKey(1));
         * System.out.println(map.containsValue("jy"));
         *
         * // System.out.println(map.remove(1));
         * System.out.println(map.remove(1, "jy"));
         *
         * System.out.println(map.keySet());
         * System.out.println(map.values());
         * System.out.println(map.entrySet());
         *
         * for (Map.Entry<Integer, String> entry : map.entrySet()) {
         * System.out.println(entry.getKey() + " " + entry.getValue());
         * }
         */

        treeMap.put(1, "jd");
        treeMap.put(2, "jy");
        treeMap.put(3, "jy");
        treeMap.put(4, "jy");
        treeMap.put(5, "jy");
        treeMap.put(6, "jy");
        treeMap.put(7, "jy");
        treeMap.put(8, "jy");
        treeMap.put(9, "jy");
        treeMap.put(10, "jy");

        System.out.println(treeMap);
    }
}

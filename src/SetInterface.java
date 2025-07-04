import java.util.*;

public class SetInterface {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("E");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");

        System.out.println(set.size());
        System.out.println(set);
        System.out.println(set.contains("A"));

        // Iterator
        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}

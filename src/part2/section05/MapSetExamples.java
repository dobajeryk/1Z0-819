package part2.section05;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapSetExamples {
    public static void main(String[] args) {

        // Use Map.of to populate a Map, with comma delimited values
        // representing key1, value1, key2, value2 etc.
        Map<String, Integer> treeMap = new TreeMap<>(Map.of(
                "Mary", 30,
                "John", 35,
                "Ralph", 23,
                "George", 15,
                "Kate", 50));
        System.out.println("Initial Values: " + treeMap);
        // This returns a modifiable View of the Map, however, you
        // cannot add entries.
        Set entrySet = treeMap.entrySet();
        entrySet.remove("John");
        System.out.println(treeMap);

        entrySet.remove(Map.entry("John", 25));
        System.out.println(treeMap);

        entrySet.remove(Map.entry("John", 35));
        System.out.println(treeMap);

        // Collection of just the values...
        Collection<Integer> values = treeMap.values();
        values.remove(23);
        System.out.println(treeMap);

// Collection of just the keys
        Collection<String> keySet = treeMap.keySet();
        keySet.remove("Mary");
        System.out.println(treeMap);

        // Add some more values to original Map.
        treeMap.putAll(Map.of(
                "Carol", 5,
                "Martha", 46,
                "Mark", 33));
        System.out.println(treeMap);
        System.out.println("Size of keySet Set: " + keySet.size());

        keySet.retainAll(Set.of("Carol", "Kate", "Mary", "Andrew"));
        System.out.println(treeMap);

        Map<String, Integer> tCopyMutable =
                new TreeMap<>(Map.copyOf(treeMap));
        tCopyMutable.put("Tom", 30);
        System.out.println(tCopyMutable);

        tCopyMutable.put("Ralph", 25);
        System.out.println(tCopyMutable);
        tCopyMutable.entrySet().add(Map.entry("John", 35));
        System.out.println(tCopyMutable);

    }
}

package part2.section17;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class TestClass {
    public static void main(String[] args) {
        List<String> vowels = new ArrayList<String>();
        vowels.add("a");
        vowels.add("e");
        vowels.add("i");
        vowels.add("o");
        vowels.add("u");
        Function<List<String>, List<String>> f = list->list.subList(2, 4);
        List<String> apply = f.apply(vowels);
        vowels.forEach(System.out::print);
    }
}
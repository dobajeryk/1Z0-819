package part1.section03.string;

import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {
        // Set some data up
        String[] wordArray = new String[]{"Hello", "World", "How", "are", "you"};

        // ---- public String concat(String str)
        String sentence = "";

        // StringJoiner was added in Java 8 as well..
        StringJoiner sj = new StringJoiner(" ");
        for (String word : wordArray) sj.add(word);
        sentence = sj.toString();
        System.out.println("Our sentence using StringJoiner: " + sentence);

    }
}
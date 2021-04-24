package part2.section14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FileIOExample {

    // This method uses a FileWriter to print 2500 random numbers
    private static void writeRandomNumbersToFile(String fileName)
            throws IOException {
        Random r = new Random();
        String numbersList;

        // Use try with resources to create output character stream, FileWriter
        // dumping a set of numbers to the file.
        try (FileWriter outputStream = new FileWriter(fileName)) {
            // Create 100 sets of random numbers
            for (int i = 0; i < 100; i++) {

                // Use random generator to create a set of 25 numbers between 1 and 100
                numbersList = r.ints(25, 1, 100)
                        // Map to string
                        .mapToObj((s) -> String.valueOf(s))
                        // Create a single string from all 25 numbers delimited by space
                        .reduce("", (string, element) -> String.join(" ", string, element));
                // Dump the string to the output file with a carriage return
                outputStream.write(numbersList + "\n");
            }
        }
    }

    // This method uses a FileReader wrapped in a BufferedReader
    private static List<Integer> readRandomNumbersFromFile(String fileName)
            throws IOException {

        List<Integer> numbers = new ArrayList<>();

        // Using BufferedReader wrapping a FileReader.  More efficient and provides
        // readLine method
        try (BufferedReader inStream =
                     new BufferedReader(new FileReader(fileName))) {
            String line;
            // Read each line.
            while ((line = inStream.readLine()) != null) {
                // Split each line by white space and add numbers to a list
                Arrays.asList(line.split("\\s"))
                        .forEach((s) -> {
                            try {
                                numbers.add(Integer.parseInt(s));
                            } catch (Exception e) {
                                // ignore junk;
                            }
                        });

            }
        }
        System.out.println("Total number of numbers retrieved = " +
                numbers.size());
        return numbers;
    }

    public static void main(String[] args) throws IOException {
        writeRandomNumbersToFile("characterData.txt");
    }
}
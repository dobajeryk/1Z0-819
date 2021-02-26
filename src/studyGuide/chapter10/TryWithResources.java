package studyGuide.chapter10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {
        try {
            method();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    private static void method() throws IOException {

//        Blok try-wtih-resource nie musi miec ani jednego bloku catch czy finally!
//        Blok finnaly jest tworzony niejawnie!
//        Niejawny blok finally jest uruchamiany przed jawnymi catch i/lub catch!
        try (FileInputStream in = new FileInputStream("data.txt");
             FileOutputStream out = new FileOutputStream("output.txt")) {
        }
    }
}

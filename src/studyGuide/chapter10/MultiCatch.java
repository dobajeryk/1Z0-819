package studyGuide.chapter10;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MultiCatch {
    public static void main(String[] args) {


//      Nie mozemy tak zrobic, poniewaz nie mozna uzywac powiazanych
//      excpetionow. Kolejnosc w tym wypadku nie ma znaczenia!

//        try {
//            throw new IOException();
//        } catch (FileNotFoundException | IOException e) {
//
//        }

        try {
            throw new IOException();
        } catch (IOException e) {

        }
    }
}

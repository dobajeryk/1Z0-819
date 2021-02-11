package part1.section03.primitiveTypesAndStringApi;

public class InitializingPrimitiveTypes {
    public static void main(String[] args) {
        // mozliwe sposoby zainicjalizowania chara!
        char myChar1 = '\u0041';
        char myChar2 = 65;
        char myChar3 = 'A';
        System.out.println("myChar1 " + myChar1);
        System.out.println("myChar2 " + myChar2);
        System.out.println("myChar3 " + myChar3);

        // suffixes
        long myLong1 = 127l;
        long myLong2 = 127L;

        float myFloat1 = 127f;
        float myFloat2 = 127F;

        double myDouble1 = 127d;
        double myDouble2 = 127D;

        // prefixes
        byte myByte1 = 0b011; // binary
        byte myByte2 = 017; // octal
        byte myByte3 = 0x1E; // hexadecimal

        // wszystkie typy liczbowe mozemy zainicajlizowac za pomoca chara!
        double myDouble3 = 'a';

        /*
        Dla zwiekszenia czytelnosci mozemy uzywac podkreslnika, aby oddzielac od siebie np. wielkosci
        rzedow.
        UWAGA!
        _ nie moze byc:
        - na poczatku literalu
        - na koncu literalu
        - przed lub po sufixie/prefixie
         */

        //poprawne
        byte b7 = 0b0000_0001;
        char c7 = 0x0_07F;
        short s7 = 011_11;
        int i7 = 1_000_000;
        long d7 = 1_000_000L;
        float f7 = 1_000.000_000f;
        double l7 = 1.000_0000e10;

        //niepoprawne
//        byte b8 = 0b_00000001;  // Cannot have underscore directly after 0b
//        char c8 = 0x_007F;  // Cannot have underscore directly after 0x
//        int i8 = 1000000_;  // Underscore cannot be at end of literal
//        long d8 = 1000000_L; // Underscore cannot be prior to suffix  (L/l,F/f,D/d)
//        float f8 = _1000.000000; // Underscore cannot be at start of literal
//        double l8 = 1.0000000_e10; // Underscore cannot prefix exponential in literal

    }
}

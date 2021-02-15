package part1.section03.primitiveTypes;

public class NarrowingAndWidening {
    public static void main(String[] args) {
        /*
        Narrowing is when you assign a larger primitive data literal or variable to a smaller one

        Widening is when you are putting something small in a larger variable
         */

        // narrowing examples
        byte b = 127;
        char c = 65535;
        short s = 32767;

        // Implicit narrowing can no longer be done because the literal does not fit to container
//        short s1 = 32768;

        // widening examples
        long myLong = 0;

        // short and char are the same width but char is unsigned!
        short myShort = 12;
        char myChar = 97;
//        myShort = myChar;
//        myChar = myShort;
    }
}

package part1.section03.primitiveTypes;

public class LocalVariablesDefaultValues {
    public static void main(String[] args) {
        /*
        Lokalna zmienna musi zostac w pelni zainicjalizowana przed uzyciem!

        Zmienna lokalna - zmienna w metodzie
         */

        // define local variables for all primitive data types
        byte mainByte;
        char mainChar;
        short mainShort;
        int mainInt;
        long mainLong;
        float mainFloat;
        double mainDouble;
        boolean mainBoolean;

        System.out.println("Local variables in a main method");

        //  Initialize our variables
        mainByte = 0;
        mainChar = 'a';
        mainShort = 1;
        mainInt = 2;
        mainLong = 3L;
        mainFloat = 1.0f;
        mainDouble = 2.0d;
        mainBoolean = false;

        // Add the following statements which access and tries to print the uninitialized local variables
        System.out.println("----------  Are Local Variables set to default values?? --------------");
        System.out.println("mainByte = " + mainByte);
        System.out.println("mainChar = " + mainChar);
        System.out.println("mainShort = " + mainShort);
        System.out.println("mainInt = " + mainInt);
        System.out.println("mainLong = " + mainLong);
        System.out.println("mainFloat = " + mainFloat);
        System.out.println("mainDouble = " + mainDouble);
        System.out.println("mainBoolean = " + mainBoolean);
    }
}

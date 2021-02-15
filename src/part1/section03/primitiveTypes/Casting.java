package part1.section03.primitiveTypes;

public class Casting {
    public static void main(String[] args) {
        /*
        Underflow is definig or casting a values less than the minimum value for the datatype
        Overflow is definig or casting a values greater than the maximum value for the datatype
         */

        int myInt1 = Short.MIN_VALUE - 1;
        int myInt2 = Short.MAX_VALUE + 1;

        short sUnderflow = (short) myInt1;
        short sOverflow = (short) myInt2;

        System.out.println(sUnderflow);
        System.out.println(sOverflow);
    }
}

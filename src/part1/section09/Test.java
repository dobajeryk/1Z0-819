package part1.section09;

abstract class AbstractClass {
    protected static int counter;  // Line 1
//    protected static abstract int getCounter();     // Line 2
//    static abstract void printCounter();  // Line 3

}

public class Test extends AbstractClass {

    public static void main(String[] args) {
        AbstractClass.counter++;   // Line 4
        printCounter();
    }

    public static int getCounter() {  // Line 5
        return AbstractClass.counter; // Line 6
    }

    public static void printCounter() { // Line 7
        System.out.println("Counter = " + getCounter());
    }
}

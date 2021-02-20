package part1.section06;

// For all the examples below, the initializers reference variables
// declared after the blocks.
class Thing {

    // Constructor
    Thing() {
        secondString = "b" + secondString;
    }

    // Initializer
    {
        firstString = this.secondString;
    }

    // Static Initializer
    static {
//        System.out.println(thirdString);
        thirdString = "c";
    }

    // Two instance variables
    String firstString;
    String secondString;

    // static variable
    static String thirdString;

    public String toString() {
        return firstString + secondString + thirdString;
    }
}

public class ForwardReference {
    public static void main(String[] args) {
        Thing one = new Thing();
        System.out.println(one);
    }
}

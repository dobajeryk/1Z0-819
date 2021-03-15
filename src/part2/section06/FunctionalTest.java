package part2.section06;

// Interface with 3 abstract methods
interface Functionable {

    int function(int i1, int i2);

    String toString();

    boolean equals(Object o);

    int hashCode();
}

public class FunctionalTest {
    public static void main(String[] args) {
        // Lambda Expression using Functionable interface, which implies
        // Functionable interface is a function interface.
        Functionable f = (s, t) -> s + t;
        System.out.println(f.function(5, 5));
        System.out.println(f.toString());
    }
}

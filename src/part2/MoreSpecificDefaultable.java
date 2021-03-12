package part2;

// Interface extends Defaultable, and overrides the default method
public interface MoreSpecificDefaultable extends Defaultable {
    default void defaultNotAbstractMethod() {
        System.out.println("MoreSpecificDefaultable default method ");
    }
}

// Class implements both interfaces
class MoreSpecific implements Defaultable, MoreSpecificDefaultable {

    // implements the abstractMethod and calls the default method
    public void abstractMethod() {
        defaultNotAbstractMethod();  // Which default method is used?
    }

    // invokes the abstract method
    public static void main(String[] args) {
        new MoreSpecific().abstractMethod();
    }
}

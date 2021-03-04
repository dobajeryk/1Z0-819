package part2.section02.nested;

// Enclosing Class
public class EnclosingClass {
    // instance field on enclosing class
    public String outerName = "outer";

    // static field on enclosing class
    public static String staticOuterName = "OUTER";

    // static method on enclosing class
    public static void doSomethingStatically() {
        System.out.println("doSomethingStatically invoked.");
        // invoke nested class's method via class reference
        NestedStaticClass.getStaticName();
    }

    // instance method on enclosing class
    public void doSomethingOnInstance() {
        System.out.println("doSomethingOnInstance invoked.");
        // invoke nested class's method via instance reference
        new NestedStaticClass().getInstanceName();
    }

    // Begin declaration of static nested class named NestedStaticClass
    public static class NestedStaticClass {
        // static field
        public static String staticName = "NestedStaticClass.staticName";

        public static String staticOuterName = "NESTED";

        // instance field
        public String instanceName = "NestedStaticClass.instanceName";

        // static method
        public static String getStaticName() {
            return "getStaticName() = " + NestedStaticClass.staticName;
        }

        // instance method
        public String getInstanceName() {
//            System.out.println(outerName);
            System.out.println(staticOuterName);
            System.out.println(this.staticOuterName);
            System.out.println(EnclosingClass.staticOuterName);
            doSomethingStatically();
//            doSomethingOnInstance();
            return "getInstanceName() = " + this.instanceName;
        }

        public enum Colors {
            RED, BLUE, YELLOW
        }

        public interface NestedInterface {

        }
    }  // Ends declaration of the static nested class

}

// This class tests the EnclosingClass and it's nested class
// from disassociated class.
class TestEnclosingClass {

    public static void main(String[] args) {

        new EnclosingClass().doSomethingOnInstance();

        // Reference static field on static nested class directly:
        System.out.println(EnclosingClass.NestedStaticClass.staticName);

        // Reference static method on static nested class directly:
        System.out.println(EnclosingClass.NestedStaticClass.getStaticName());

        // Reference enum on static nested class directly:
        System.out.println(EnclosingClass.NestedStaticClass.Colors.BLUE);

        // Local variable declaration using a nested class's interface
        EnclosingClass.NestedStaticClass.NestedInterface n;

        EnclosingClass.NestedStaticClass nestedStaticClass = new EnclosingClass.NestedStaticClass();

    }
}

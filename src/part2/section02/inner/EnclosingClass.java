package part2.section02.inner;

public class EnclosingClass {

    // Add Constructor
    EnclosingClass(String name) {
        this.outerName = name;
    }

    // instance field on enclosing class
    public String outerName = "outer";
    public static String outerNameStatic = "outer";

    public InnerMemberClass innerMemberClass = new InnerMemberClass();

    // instance method on enclosing class
    public void doSomethingOnInstance() {
        System.out.print("doSomethingOnInstance invoked: ");
        // invoke nested class's method via class reference
        System.out.println(new InnerMemberClass().getInstanceName());
    }

    // Begin declaration of inner member class named InnerMemberClass
    public class InnerMemberClass {

        // instance field
        public String instanceName = "InnerMemberClass.instanceName";

        // instance method
        public String getInstanceName() {
            return "getInstanceName() = " + this.instanceName;
        }

//        public String getOuterName() {
//            return "InnerMemberClass.getOuterName() = " + outerName;
//        }

        public String getOuterName() {
            String outerName = "local_outerName";
            return outerName + " : " +
                    this.outerName + " : " +
                    EnclosingClass.this.outerName;
        }

        public static final String staticName = "staticName";

        public String outerName = "inner";

    }  // Ends declaration of the inner member class

}

// This class tests the EnclosingClass and it's inner member class
// using a disassociated class.
class TestEnclosingClass {

    public static void main(String[] args) {
        EnclosingClass e = new EnclosingClass("e's Instance");
        e.doSomethingOnInstance();

        // We can declare a local variable of the inner class
        EnclosingClass.InnerMemberClass i;

        // You must use the instance new operator, much like a method.
//        i = new EnclosingClass("Tak dziala").new InnerMemberClass();
        i = e.new InnerMemberClass();

        // Use local variable referencing the inner member class to
        // access method on the inner class
        System.out.println("Invoking i.getOuterName: " + i.getOuterName());

        // Create another instance of the Enclosing Class
        EnclosingClass f = new EnclosingClass("f's Instance");

        // Declare and Assign a variable to the inner member class of
        // new instance in a single statement
        EnclosingClass.InnerMemberClass j = f.new InnerMemberClass();
        System.out.println("Invoking j.getOuterName: " + j.getOuterName());

        e.innerMemberClass.instanceName = "Testing";
        System.out.println(e.innerMemberClass.getInstanceName());
    }
}
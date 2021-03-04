package part2.section02;

public class TestInheritance extends OuterMost {
    public static void main(String[] args) {
        new TestInheritance().testInnerClassMembers();

        // Static method - no instance of current class so
// cannot access the inner classes directly
//        new ProtectedInner();
//        new PublicInner();
    }

    private void testInnerClassMembers() {
        // non-static method - instance of current class exists so inner
        // classes (with the right access modifiers) are available...
        new ProtectedInner();
        // First Level
        new PublicInner();

        this.new ProtectedInner();
        // First Level
        this.new PublicInner();

        // Second Level
        new PublicInner().new NestedInnerSecondLevel();

        // This does not work
//        new PublicInner().NestedInnerSecondLevel();


    }


    // This inner class extends the inner class that was inherited
// from the OuterMost class
    class KeepExtending extends PublicInner {
        KeepExtending() {
            System.out.println("Extend the inner class as an " +
                    "inherited member");
        }
    }
}

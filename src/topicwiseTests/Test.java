package topicwiseTests;

class Outer {
    private String name = "NOW OR NEVER";
    //Insert inner class definition here

    class Inner {
        public void printName() {
            System.out.println(Outer.this.name);
        }
    }
}

public class Test {
    public static void main(String [] args) {
        new Outer().new Inner().printName();
    }
}

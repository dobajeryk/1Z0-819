package topicwiseTests.test01.main;

public abstract class main {
    static String main = "ONE";

    public main() {
        System.out.println("TWO");
    }

     static final public  void main(String [] args) {
        main();
    }

    public static void main() {
        System.out.println(main);
    }
}


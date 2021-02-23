package topicwiseTests.test01;

public class Narrowing {
    public static void main(String[] args) {
        final int i = 100;
        short s = i + 100;

        int i2 = 100;
//        short s2 = i2 + 100;
//        System.out.println(s2);
    }
}

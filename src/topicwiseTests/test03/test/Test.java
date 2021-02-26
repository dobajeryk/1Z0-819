package topicwiseTests.test03.test;

import topicwiseTests.test03.*;

public class Test {
    public static void main(String[] args) {
        M obj1 = new M();
        N obj2 = (N)obj1;
        obj2.printName();
    }
}

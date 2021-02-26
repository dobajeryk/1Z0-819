package topicwiseTests.test03;

class Parent {
    String quote = "MONEY DOESN'T GROW ON TREES";
}

class Child extends Parent {
    String quote = "LIVE LIFE KING SIZE";
}

class GrandChild extends Child {
    String quote = "PLAY PLAY PLAY";
}

public class Test5 {
    public static void main(String[] args) {
        GrandChild gc = new GrandChild();
        System.out.println(((Parent)(Child)gc).quote);
    }
}

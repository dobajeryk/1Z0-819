package topicwiseTests.test01;

public class Concat {
    public static void main(String[] args) {
        String s = "Test";
        change(s);
        System.out.println(s);
    }

    public static void change(String s) {
        s.concat(" Test Dwa");
    }
}

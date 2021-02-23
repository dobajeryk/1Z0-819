package studyGuide.chapter03;

public class TernaryOperator {
    public static void main(String[] args) {
        int i = 5;
        short s = 5;
        boolean b = Math.random() > 0.3;
        int value = b ? i : s;
    }
}

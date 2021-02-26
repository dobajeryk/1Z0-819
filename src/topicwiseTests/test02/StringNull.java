package topicwiseTests.test02;

public class StringNull {
    public static void main(String [] args) {
        String text = null;
//        System.out.println(text.repeat(3));
//        System.out.println(null + null + null);
        System.out.println(null + "null" + null);
        System.out.println(text += "null".repeat(2));
        text = null;
        System.out.println(text + text + text);
        text = null;
//        text += null; System.out.println((text.concat(null)));
    }
}

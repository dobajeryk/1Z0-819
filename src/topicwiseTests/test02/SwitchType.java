package topicwiseTests.test02;

public class SwitchType {
    public static void main(String[] args) {
        byte var = 100;
        switch(var) {
            case 100:
                System.out.println("var is 100");
                break;
//            case 200:
//                System.out.println("var is 200");
//                break;
            default:
                System.out.println("In default");
        }
    }
}

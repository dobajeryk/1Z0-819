package topicwiseTests.test02;

public class UnreachableCodeWhile {
    public static void main(String[] args) {
        final boolean flag = false; //Line n1
//        while(flag) {
//            System.out.println("Good Morning!"); //Line n2
//        }
    }

    public static void main() {
        final boolean flag;
        flag = false;
        while(flag) {
            System.out.println("Good Night!");
        }
    }
}

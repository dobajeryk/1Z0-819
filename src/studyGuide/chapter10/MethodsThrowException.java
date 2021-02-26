package studyGuide.chapter10;

public class MethodsThrowException {
    public static void main(String[] args) {
    }

    private static void eatCarrot() {

    }

    public static void bad() {
        try {
            eatCarrot();
        }
//        catch (NoMoreCarrotsException e) {
//
//        }
        finally {

        }
    }

    public static void good() throws NoMoreCarrotsException {

    }
}

class NoMoreCarrotsException extends Exception {

}

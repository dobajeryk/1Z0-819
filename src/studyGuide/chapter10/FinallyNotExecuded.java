package studyGuide.chapter10;

public class FinallyNotExecuded {
    public static void main(String[] args) {
        try {
            System.out.println("Blok try 1");
            System.exit(0);
            System.out.println("Blok try 2");
        } finally {
            System.out.println("Blok finally");
        }
    }
}

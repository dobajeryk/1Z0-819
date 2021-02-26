package studyGuide.chapter10;

public class AdditionalExceptions {
    public static void main(String[] args) {
        try {
            throw new RuntimeException("Blok try");
        } catch (RuntimeException e) {
            throw new RuntimeException("Blok catch");
        } finally {
            throw new RuntimeException("Blok finally");
        }
    }
}

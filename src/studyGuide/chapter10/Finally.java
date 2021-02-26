package studyGuide.chapter10;

public class Finally {
    public static void main(String[] args) {
        int result = goHome();
        System.out.println("Wynik metody: " + result);
    }

    public static int goHome() {
        try {
            if (Math.random() > 0.3) {
                System.out.println("Rzucam blad");
                throw new Exception();
            }
            System.out.println("Nie rzucam bledu");
            System.out.println("1");
            return -1;
        } catch (Exception e) {
            System.out.println("2");
            return -2;
//            Blok finally jest zawsze wykonywany, chociaz nie zawsze musi sie skonczyc!
        } finally {
            System.out.println("3");
            return -3;
        }
    }
}

package part2.section12.intro;

public class Main {
    public static void main(String[] args) {
        System.out.println("MT start");
        Thread thread = new Thread(() -> {
            System.out.println("T0 start");
            for (int i = 0; i < 5; i++) {
                System.out.println("T0 " + i);
            }
            System.out.println("T0 stop");
        });
        thread.start();
        thread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("MT " + i);
        }
        System.out.println("MT stop");
    }
}

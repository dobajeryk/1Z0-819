package topicwiseTests.test03;

abstract class Helper {
    int num = 100;
    String operation = null;

//    abstract void help(); // Solution 3
    protected abstract void help();

    void log() {
        System.out.println("Helper-log");
    }
}

public class LogHelper extends Helper {
    private int num = 200;
    protected String operation = "LOGGING";

//    public void help() { // Solution 1
    protected void help() { // Solution 2

//    void help() {
        System.out.println("LogHelper-help");
    }

    void log() {
        System.out.println("LogHelper-log");
    }

    public static void main(String [] args) {
        new LogHelper().help();
    }
}

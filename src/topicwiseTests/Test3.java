package topicwiseTests;

class Logger {
    public void log() {
        System.out.println("GO FOR IT");
    }
}

class Printer {
    public void getType() {
        System.out.println("LASER");
    }
}

public class Test3 {
    public static void main(String[] args) {
        Logger obj = new Logger() {
            public void Log() {
                System.out.println("LET IT BE");
            }
        };
//        obj.Log();
    }
}

class Test4 {
    public static void main(String[] args) {
        var obj = new Printer() { //Line n1
            public void GetType() { //Line n2
                System.out.println("INKJET");
            }
        };
        obj.GetType(); //Line n3
    }
}
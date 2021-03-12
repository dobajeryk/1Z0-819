package part2.chapter01.nestedClasses.localClass;

public class PrintNumbers {
    private int length = 5;

    public void calculate() {
        final int width = 20;
        int length = 10;
        class MyLocalClass {

            final int length = 15;

            public void multiply() {
                System.out.println(length * width);
                System.out.println(this.length);
                System.out.println(PrintNumbers.this.length);
            }
        }
        MyLocalClass myLocalClass = new MyLocalClass();
        myLocalClass.multiply();
    }

    public static void main(String[] args) {
        PrintNumbers printNumbers = new PrintNumbers();
        printNumbers.calculate();
    }
}

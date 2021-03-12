package part2.chapter01.nestedClasses.staticNeastedClass;

public class Enclosing {

    private static int i = 10;

    public static void staticMethod() {
        System.out.println("Static method");
    }

    static class Nested {
        private int i = 15;
        private int price = 6;
        public int price2 = 6;
        {
            System.out.println(i);
            System.out.println(this.i);
            System.out.println(Enclosing.i);
            staticMethod();
        }
    }

//    public static void main(String[] args) {
//        Nested nested = new Nested();
//        System.out.println(nested.price);
//    }
}

class Main {
    public static void main(String[] args) {
        Enclosing.Nested nested = new Enclosing.Nested();
        System.out.println(nested.price2);
    }
}

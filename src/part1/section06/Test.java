package part1.section06;

class TestStatic {
    static String name = "Mary";

    public static String getName() {
        return name;
    }
}

public class Test {

    public static void main(String[] args) {
        TestStatic t0 = new TestStatic();
        TestStatic t1 = null;

        // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! //
        System.out.println(t1.name);

    }
}
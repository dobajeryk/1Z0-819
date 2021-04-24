package part2.section14;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Test {
    public static void main(String[] args) {
        Consumer<String> t1 = x -> System.out.println(x +  "heh");
        Consumer<String> t2 = x -> System.out.println(x);
        t1.accept("t1 accepted");
        t2.accept("t2 accepted");
        t1.andThen(t2).accept("and then");
    }
}
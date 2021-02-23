package studyGuide.chapter06;

import java.util.Comparator;
import java.util.function.Consumer;

public class Lambda {
    public void method() {
        x((var x) -> {}, (var x, var y) -> 0);
    }

    public void x(Consumer<String> x, Comparator<Boolean> y) {

    }

}

package part2.section18;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface MyRuntimeAnnotation {
    String author();
    double version();
    String description();
}


package Homework10.customAnnotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Max {
    int value();
    String message() default "Value must be less than or equal to {value}";
}

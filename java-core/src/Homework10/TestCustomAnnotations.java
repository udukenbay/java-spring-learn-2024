package Homework10;

import Homework10.customAnnotations.*;

import java.lang.reflect.Field;

public class TestCustomAnnotations {
    @Money
    private String price = "100.00";

    @Min(value = 1)
    @Max(value = 10)
    private int quantity = 5;

    @Email
    private String email = "testexample.com";

    @NotNull
    private String name = ""; // "Jackson Marone";

    public void validate() throws IllegalAccessException {
        Field[] fields = this.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            // money
            if (field.isAnnotationPresent(Money.class)) {
                String value = (String) field.get(this);
                if (!value.matches("\\d+(\\.\\d{1,2})?")) {
                    throw new IllegalArgumentException(field.getAnnotation(Money.class).message());
                }
            }

            // min
            if (field.isAnnotationPresent(Min.class)) {
                int value = (int) field.get(this);
                int min = field.getAnnotation(Min.class).value();

                System.out.println("current value: " + value + "; min value: " + min);

                if (value < min) {
                    throw new IllegalArgumentException(field.getAnnotation(Min.class).message().replace("{value}", String.valueOf(min)));
                }
            }

            // max
            if (field.isAnnotationPresent(Max.class)) {
                int value = (int) field.get(this);
                int max = field.getAnnotation(Max.class).value();

                System.out.println("current value: " + value + "; max value: " + max);

                if (value > max) {
                    throw new IllegalArgumentException(field.getAnnotation(Max.class).message().replace("{value}", String.valueOf(max)));
                }
            }

            // not-null
            if (field.isAnnotationPresent(NotNull.class)) {
                Object value = field.get(this);
                if (value == null) {
                    throw new IllegalArgumentException(field.getAnnotation(NotNull.class).message());
                }
            }

            // email
            if (field.isAnnotationPresent(Email.class)) {
                String value = (String) field.get(this);
                String pattern = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
                if (!value.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
                    throw new IllegalArgumentException(field.getAnnotation(Email.class).message());
                }
            }
        }
    }
}

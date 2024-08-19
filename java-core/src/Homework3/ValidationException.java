package Homework3;

public class ValidationException extends Exception {
    public ValidationException(String message, String toDo) {
        super(message);
        System.out.println("Please follow " + toDo);
    }
}

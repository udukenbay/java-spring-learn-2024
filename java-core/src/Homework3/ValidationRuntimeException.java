package Homework3;

public class ValidationRuntimeException extends RuntimeException{
    public ValidationRuntimeException(String message, String toDo) {
        super(message);
        System.out.println("please follow " + toDo);
    }
}

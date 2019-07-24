package library.exception;

/**
 * @author n2god on 07/07/2019
 * @project Exercises
 */
public class InvalidDataException extends RuntimeException {
    public InvalidDataException(String message){
        super(message);
    }
}

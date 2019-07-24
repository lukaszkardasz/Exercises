package library.exception;

/**
 * @author n2god on 15/07/2019
 * @project Exercises
 */
public class UserAlreadyExistsException extends RuntimeException {
    public UserAlreadyExistsException(String message){
        super(message);
    }
}

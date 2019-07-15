package library.exception;

/**
 * @author n2god on 15/07/2019
 * @project Exercises
 */
public class UserAlreadyExistsException extends Exception {
    public UserAlreadyExistsException(String message){
        super(message);
    }
}

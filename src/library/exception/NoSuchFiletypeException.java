package library.exception;

/**
 * @author n2god on 06/07/2019
 * @project Exercises
 */
public class NoSuchFiletypeException extends RuntimeException{
    public NoSuchFiletypeException(String message){
        super(message);
    }
}

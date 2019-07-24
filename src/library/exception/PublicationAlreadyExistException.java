package library.exception;

/**
 * @author n2god on 15/07/2019
 * @project Exercises
 */
public class PublicationAlreadyExistException extends RuntimeException {

    public PublicationAlreadyExistException(String message){
        super(message);
    }

}

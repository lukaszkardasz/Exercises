package library.model;

import library.exception.PublicationAlreadyExistException;
import library.exception.UserAlreadyExistsException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author n2god on 09/06/2019
 * @project org
 */
public class Library implements Serializable {


    //zmieniony typ
    private Map<String, Publication> publications = new HashMap<>();
    //dodane
    private Map<String, LibraryUser> users = new HashMap<>();

    //zmieniony typ zwracany
    public Map<String, Publication> getPublications() {
        return publications;
    }

    //dodany getter
    public Map<String, LibraryUser> getUsers() {
        return users;
    }

    //dodana metoda i rzucany nowy typ wyjątku
    public void addUser(LibraryUser user) {
        if(users.containsKey(user.getPesel()))
            try {
                throw new UserAlreadyExistsException(
                        "Użytkownik ze wskazanym peselem już istnieje " + user.getPesel()
                );
            } catch (UserAlreadyExistsException e) {
                e.printStackTrace();
            }
        users.put(user.getPesel(), user);
    }

    //zmieniona logika
    public void addPublication(Publication publication) {
        if(publications.containsKey(publication.getTitle()))
            try {
                throw new PublicationAlreadyExistException(
                        "Publikacja o takim tytule już istnieje " + publication.getTitle()
                );
            } catch (PublicationAlreadyExistException e) {
                e.printStackTrace();
            }
        publications.put(publication.getTitle(), publication);
    }

    //zmieniona logika
    public boolean removePublication(Publication publication) {
        if(publications.containsValue(publication)) {
            publications.remove(publication.getTitle());
            return true;
        } else {
            return false;
        }
    }
}

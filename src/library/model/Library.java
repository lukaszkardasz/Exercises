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

    private Map<String, Publication> publications = new HashMap<>();
    private Map<String, LibraryUser> users = new HashMap<>();

    public Map<String, Publication> getPublications() {
        return publications;
    }

    public Map<String, LibraryUser> getUsers() {
        return users;
    }

    public void addUser(LibraryUser user) throws UserAlreadyExistsException {
        if (users.containsKey(user.getPesel())){
             throw new UserAlreadyExistsException(
                        "Użytkownik ze wskazanym peselem już istnieje " + user.getPesel()
                );

        } users.put(user.getPesel(), user);
    }

    public void addPublication(Publication publication) {
        if (publications.containsKey(publication.getTitle())){
            try {
                throw new PublicationAlreadyExistException(
                        "Publikacja o takim tytule już istnieje " + publication.getTitle()
                );
            } catch (PublicationAlreadyExistException e) {
                e.printStackTrace();
                e.getMessage();
            }
            publications.put(publication.getTitle(), publication);
        }
    }

    public boolean removePublication(Publication pub){
        if(publications.containsValue(pub)){
            publications.remove(pub.getTitle());
            return true;
        } else{
            return false;
        }
    }
}

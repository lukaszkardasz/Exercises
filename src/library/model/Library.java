package library.model;

import library.exception.PublicationAlreadyExistException;
import library.exception.UserAlreadyExistsException;

import java.io.Serializable;
import java.util.*;

/**
 * @author n2god on 09/06/2019
 * @project org
 */
public class Library implements Serializable {

    private Map<String, Publication> publications = new HashMap<>();
    private Map<String, LibraryUser> users = new HashMap<>();

    public Optional<Publication> findPublicationByTitle(String title){
        return Optional.ofNullable(publications.get(title));
    }

    public Map<String, Publication> getPublications() {
        return publications;
    }

    public Collection<Publication> getSortedPublications(Comparator<Publication> comparator){
        ArrayList<Publication> list = new ArrayList<>(this.publications.values());
        list.sort(comparator);
        return list;
    }

    public Collection<LibraryUser> getSortedUsers(Comparator<LibraryUser> comparator){
        ArrayList<LibraryUser> list = new ArrayList<>(this.users.values());
        list.sort(comparator);
        return list;
    }

    public Map<String, LibraryUser> getUsers() {
        return users;
    }

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

    public boolean removePublication(Publication publication) {
        if(publications.containsValue(publication)) {
            publications.remove(publication.getTitle());
            return true;
        } else {
            return false;
        }
    }
}

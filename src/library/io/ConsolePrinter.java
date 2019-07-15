package library.io;

import library.model.Book;
import library.model.LibraryUser;
import library.model.Magazine;
import library.model.Publication;

import java.util.Collection;
import java.util.Collections;

/**
 * @author n2god on 21/06/2019
 * @project Exercises
 */
public class ConsolePrinter {

        public void printBooks(Collection<Publication> publications){
            int counter = 0;
            for (Publication publication : publications) {
                if(publication instanceof Book){
                    printLine(publication.toString());
                    counter++;
                }
            }
            if(counter ==0){
                printLine("Brak książek w bibliotece");
            }
        }

    public void printMagazines(Collection<Publication> publications){
        int counter = 0;
        for (Publication publication : publications) {
            if(publication instanceof Magazine){
                printLine(publication.toString());
                counter++;
            }
        }
        if(counter ==0){
            printLine("Brak magazynów w bibliotece");
        }
    }

    public void printLine(String text) {
        System.out.println(text);
    }

    public void printUsers(Collection<LibraryUser> users){
        for (LibraryUser user : users) {
            printLine(user.toString());
        }
    }

}

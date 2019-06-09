package Library.model;

import Library.Data.Book;

/**
 * @author n2god on 09/06/2019
 * @project Exercises
 */
public class Library {

    public static final int MAX_BOOKS = 1000;
    private Book[] books = new Book[MAX_BOOKS];
    private int booksNumber;

    public void addBook(Book book){
        if (booksNumber < MAX_BOOKS){
            books[booksNumber] = book;
            booksNumber++;
        } else {
            System.out.println("Maksymalna liczba książek została osiągnięta!");
        }
    }


    public void printBooks(){
        if (booksNumber == 0) {
            System.out.println("Brak książek w bibliotece");
        } else {
            for (int i = 0; i < booksNumber; i++) {
                books[i].printInfo();
            }
        }
    }
}

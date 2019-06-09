package Library.io;

import Library.Data.Book;

import java.util.Scanner;

/**
 * @author n2god on 09/06/2019
 * @project Exercises
 */
public class DataReader {

    private Scanner scanner = new Scanner(System.in);

    public void close(){
        scanner.close();
    }

    public Book readAndCreateBook(){
        System.out.println("Tytuł: ");
        String title = scanner.nextLine();
        System.out.println("Autor: ");
        String author = scanner.nextLine();
        System.out.println("Wydawnictwo: ");
        String publisher = scanner.nextLine();
        System.out.println("ISBN: ");
        String isbn = scanner.nextLine();
        System.out.println("Rok wydania: ");
        int releaseDate = getInt();
        System.out.println("Ilość stron: ");
        int pages = getInt();

        return  new Book(title, author, releaseDate, pages, publisher, isbn);
    }
    public int getInt(){
        int resutl = scanner.nextInt();
        scanner.nextLine();
        return resutl;
    }

}

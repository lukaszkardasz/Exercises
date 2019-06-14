package Library.io;

import Library.model.Book;
import Library.model.Magazine;

import java.util.Scanner;

/**
 * @author n2god on 09/06/2019
 * @project Exercises
 */
public class DataReader {

    private Scanner scanner = new Scanner(System.in);

    public void close() {
        scanner.close();
    }

    public int getInt() {
        int result = scanner.nextInt();
        scanner.nextLine();
        return result;
    }

    public Book readAndCreateBook() {
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

        return new Book(title, author, releaseDate, pages, publisher, isbn);
    }

    public Magazine readAndCreateMagazine() {
        System.out.println("Tytuł: ");
        String title = scanner.nextLine();
        System.out.println("Wydawnictwo: ");
        String publisher = scanner.nextLine();
        System.out.println("Język: ");
        String language = scanner.nextLine();
        System.out.println("Rok wydania: ");
        int year = getInt();
        System.out.println("Miesiąc: ");
        int month = getInt();
        System.out.println("Dzień: ");
        int day = getInt();

        return new Magazine(year, month, day, publisher, language,  title);
    }


}

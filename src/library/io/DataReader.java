package library.io;

import library.model.Book;
import library.model.Magazine;

import java.util.Scanner;

/**
 * @author n2god on 09/06/2019
 * @project org
 */
public class DataReader {

    private Scanner scanner = new Scanner(System.in);
    private ConsolePrinter printer;

    public DataReader(ConsolePrinter printer) {
        this.printer = printer;
    }

    public void close() {
        scanner.close();
    }

    public int getInt() {
        try {
            return scanner.nextInt();
        } finally {
            scanner.nextLine();
        }
    }

    public Book readAndCreateBook() {
        printer.printLine("Tytuł: ");
        String title = scanner.nextLine();
        printer.printLine("Autor: ");
        String author = scanner.nextLine();
        printer.printLine("Wydawnictwo: ");
        String publisher = scanner.nextLine();
        printer.printLine("ISBN: ");
        String isbn = scanner.nextLine();
        printer.printLine("Rok wydania: ");
        int releaseDate = getInt();
        printer.printLine("Ilość stron: ");
        int pages = getInt();

        return new Book(title, author, releaseDate, pages, publisher, isbn);
    }

    public Magazine readAndCreateMagazine() {
        printer.printLine("Tytuł: ");
        String title = scanner.nextLine();
        printer.printLine("Wydawnictwo: ");
        String publisher = scanner.nextLine();
        printer.printLine("Język: ");
        String language = scanner.nextLine();
        printer.printLine("Rok wydania: ");
        int year = getInt();
        printer.printLine("Miesiąc: ");
        int month = getInt();
        printer.printLine("Dzień: ");
        int day = getInt();

        return new Magazine(year, month, day, publisher, language, title);
    }


}

package Library.app;

import Library.model.Book;
import Library.io.DataReader;
import Library.model.Library;
import Library.model.Magazine;

/**
 * @author n2god on 09/06/2019
 * @project Exercises
 */
public class LibraryControl {

    private static final int EXIT = 0;
    private static final int ADD_BOOK = 1;
    private static final int ADD_MAGAZINE = 2;
    private static final int PRINT_BOOKS = 3;
    private static final int PRINT_MAGAZINES = 4;

    private DataReader dataReader = new DataReader();
    private Library library = new Library();

    public void controlLoop() {
        int option = -1;

        do {
            printOptions();
            option = dataReader.getInt();
            switch (option) {
                case EXIT:
                    exit();
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case ADD_MAGAZINE:
                    addMagazine();
                    break;
                case PRINT_BOOKS:
                    printBooks();
                    break;
                case PRINT_MAGAZINES:
                    printMagazines();
                    break;
                default:
                    System.out.println("Nieprawidłowe dane, spróbuj jeszcze raz");
                    break;
            }
        } while (option != EXIT);

    }

    private void printMagazines() {
        library.printMagazines();
    }

    private void addBook() {
        Book book = dataReader.readAndCreateBook();
        library.addBook(book);
    }

    private void addMagazine() {
        Magazine magazine = dataReader.readAndCreateMagazine();
        library.addMagazine(magazine);
    }


    private void printBooks() {
        library.printBooks();
    }

    private void printOptions() {
        System.out.println("Wybierz opcję: ");
        System.out.println(EXIT + " - wyjście z programu");
        System.out.println(ADD_BOOK + " - dodanie nowej książki");
        System.out.println(ADD_MAGAZINE + " - dodanie nowego magazynu");
        System.out.println(PRINT_BOOKS + " - wyświetl dostępne książki");
        System.out.println(PRINT_MAGAZINES + " - wyświetl dostępne magazyny");
    }

    private void exit() {
        System.out.println("Zakończenie pracy programu");
        dataReader.close();
        System.exit(0);
    }


}

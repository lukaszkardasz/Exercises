package Library.app;

import Library.Data.Book;
import Library.io.DataReader;
import Library.model.Library;

/**
 * @author n2god on 09/06/2019
 * @project Exercises
 */
public class LibraryControl {

    private final int EXIT = 0;
    private final int ADD = 1;
    private final int PRINT = 2;

    private DataReader dataReader = new DataReader();
    private Library library = new Library();

    public void controlLoop(){
        int option = -1;

        do {
            printOptions();
            option = dataReader.getInt();
            switch (option) {
                case EXIT:
                    exit();
                    break;
                case ADD:
                    addBook();
                    break;
                case PRINT:
                    printBooks();
                    break;
                default:
                    System.out.println("Nieprawidłowe dane, spróbuj jeszcze raz");
                    break;
            }
        } while (option != EXIT);

    }

    private void addBook() {
        Book book = dataReader.readAndCreateBook();
        library.addBook(book);
    }

    private void printBooks() {
        library.printBooks();
    }

    private void printOptions() {
        System.out.println("Wybierz opcję: ");
        System.out.println(EXIT + " - wyjście z programu");
        System.out.println(ADD + " - dodanie nowej książki");
        System.out.println(PRINT + " - wyświetl dostępne książki");
    }

    private void exit() {
        System.out.println("Zakończenie pracy programu");
        dataReader.close();
        System.exit(0);
    }


}

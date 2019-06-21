package library.app;

import library.model.Book;
import library.io.DataReader;
import library.model.Library;
import library.model.Magazine;

/**
 * @author n2god on 09/06/2019
 * @project org
 */
public class LibraryControl {
    private DataReader dataReader = new DataReader();

    private Library library = new Library();

    public void controlLoop() {
        Option option;

        do {
            printOptions();
            option = Option.createEnumFromInt(dataReader.getInt());
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
            }
        } while (option != Option.EXIT);

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
        for (Option option : Option.values()){
            System.out.println(option);
        }
    }

    private void exit() {
        System.out.println("Zakończenie pracy programu");
        dataReader.close();
        System.exit(0);
    }


}

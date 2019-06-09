package Library.app;


import Library.Data.Book;

public class LibraryApp {

    public static void main(String[] args) {
        final String appName = "Biblioteka v0.9";

        Book[] books = new Book[1000];
        System.out.println(appName);
        LibraryControl libControl = new LibraryControl();
        libControl.controlLoop();
        System.out.println("System może przechowywać do " + books.length + " książek");
    }
}

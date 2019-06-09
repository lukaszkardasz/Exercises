package Library.app;


import static Library.model.Library.MAX_BOOKS;

public class LibraryApp {
    private static final String APP_NAME = "Biblioteka v0.9";

    public static void main(String[] args) {
        System.out.println(APP_NAME);
        LibraryControl libControl = new LibraryControl();
        libControl.controlLoop();
        System.out.println("System może przechowywać do " + MAX_BOOKS + " książek");
    }
}

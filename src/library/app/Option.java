package library.app;

import library.exception.NoSuchOptionException;

public enum Option {

    EXIT(0, "Wyjscie z programu"),
    ADD_BOOK(1, "Dodaj książkę"),
    ADD_MAGAZINE(2, "Dodaj magazyn"),
    PRINT_BOOKS(3, "Wypisz książki"),
    PRINT_MAGAZINES(4, "Wypisz magazyny");

    private int value;
    private String description;


    Option(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return value + " - " + description;
    }

    static Option createEnumFromInt(int option) throws NoSuchOptionException {
        try {
            return Option.values()[option];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new NoSuchOptionException("Brak opcji o id: " + option);
        }
    }

}

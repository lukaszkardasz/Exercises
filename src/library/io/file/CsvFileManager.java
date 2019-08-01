package library.io.file;

import library.exception.DataExportException;
import library.exception.DataImportException;
import library.exception.InvalidDataException;
import library.exception.UserAlreadyExistsException;
import library.model.*;

import java.io.*;
import java.util.Collection;
import java.util.Scanner;

/**
 * @author n2god on 07/07/2019
 * @project Exercises
 */
public class CsvFileManager implements FileManager {
    private static final String LIBRARY_FILE_NAME = "C:\\Java\\LibraryApp v4\\src\\library\\Library.csv";
    private static final String USERS_FILE_NAME = "C:\\Java\\LibraryApp v4\\src\\library\\users.csv";

    @Override
    public void exportData(Library library){
        exportPublications(library);
        exportUsers(library);
    }

    private void exportPublications(Library library) {
        Collection<Publication> publications = library.getPublications().values();
        exportToCsv(publications, LIBRARY_FILE_NAME);
    }

    private void exportUsers(Library library) {
        Collection<LibraryUser> users = library.getUsers().values();
        exportToCsv(users, USERS_FILE_NAME);
    }

    private <T extends CsvConvertable> void exportToCsv(Collection <T> collection, String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){
            for (T element : collection) {
                bufferedWriter.write(element.toCsv());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            try {
                throw new DataExportException("Błąd zapisu danych do pliku " + fileName);
            } catch (DataExportException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public Library importData(){
        Library library = new Library();
        importPublications(library);
        importUsers(library);
        return library;
    }

    private void importUsers(Library library) {
        try (BufferedReader br = new BufferedReader(new FileReader(USERS_FILE_NAME))) {
            br.lines()
                    .map(this::createUserFromString)
                    .forEach(library::addUser);
        } catch (FileNotFoundException e) {
                throw new DataImportException("Brak pliku " + USERS_FILE_NAME);
            } catch (IOException e) {
            throw new DataImportException("Błąd odczytu pliku: " + USERS_FILE_NAME);
        }
    }

    private LibraryUser createUserFromString(String csvText) {
        String[] split = csvText.split(";");
        String firstName = split[0];
        String lastName = split[1];
        String pesel = split[2];
        return new LibraryUser(firstName, lastName, pesel);
    }

    private void importPublications(Library library) {
        try (BufferedReader br = new BufferedReader(new FileReader(LIBRARY_FILE_NAME))) {
            br.lines()
                    .map(this::createObjectFromString)
                    .forEach(library::addPublication);
        } catch (FileNotFoundException e){
            throw new DataImportException("Brak pliku: " + LIBRARY_FILE_NAME);
        } catch (IOException e){
            throw new DataImportException("Nieznany typ publikacji: " + LIBRARY_FILE_NAME);
        }
    }

    private Publication createObjectFromString(String csvText) {
        String[] split = csvText.split(";");
        String type = split[0];
        if(Book.TYPE.equals(type)) {
            return createBook(split);
        } else if(Magazine.TYPE.equals(type)) {
            return createMagazine(split);
        }
        throw new InvalidDataException("Nieznany typ publikacji: " + type);
    }

    private Book createBook(String[] data) {
        String title = data[1];
        String publisher = data[2];
        int year = Integer.parseInt(data[3]);
        String author = data[4];
        int pages = Integer.parseInt(data[5]);
        String isbn = data[6];
        return new Book(title, author, year, pages, publisher, isbn);
    }

    private Magazine createMagazine(String[] data) {
        String title = data[1];
        String publisher = data[2];
        int year = Integer.parseInt(data[3]);
        int month = Integer.parseInt(data[4]);
        int day = Integer.parseInt(data[5]);
        String language = data[6];
        return new Magazine(title, publisher, language, year, month, day);
    }
}

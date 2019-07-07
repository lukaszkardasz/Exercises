package library.io.file;

import library.exception.DataExportException;
import library.exception.DataImportException;
import library.model.Library;

import java.io.*;

/**
 * @author n2god on 06/07/2019
 * @project Exercises
 */

public class SerializableFileManager implements FileManager {
    static final String FILE_NAME = "C:\\java\\Exercises\\src\\library\\io\\file\\library.o";

    @Override
    public Library importData() throws DataImportException {
        try (FileInputStream fis = new FileInputStream(FILE_NAME);
             ObjectInputStream ois = new ObjectInputStream(fis);
        ) {
            return (Library) ois.readObject();
        } catch (FileNotFoundException e) {
            throw new DataImportException("Brak pliku " + FILE_NAME);
        } catch (IOException e) {
            throw new DataImportException("Błąd odczytu pliku " + FILE_NAME);
        } catch (ClassNotFoundException e) {
            throw new DataImportException("Niezgodny typ danych w pliku " + FILE_NAME);
        }
    }


    @Override
    public void exportData(Library library) throws DataExportException {
        try (FileOutputStream fos = new FileOutputStream(FILE_NAME);
             ObjectOutputStream oos = new ObjectOutputStream(fos);
        ){
            oos.writeObject(library);
        } catch (FileNotFoundException e) {
            throw new DataExportException("Brak pliku " + FILE_NAME);
        } catch (IOException e) {
            throw new DataExportException("Błąd zapisu danych do pliku " + FILE_NAME);
        }
    }
}


package library.io.file;

import library.exception.DataExportException;
import library.exception.DataImportException;
import library.model.Library;

/**
 * @author n2god on 06/07/2019
 * @project Exercises
 */
public interface FileManager {
    Library importData() throws DataImportException;
    void exportData(Library library) throws DataExportException;
}

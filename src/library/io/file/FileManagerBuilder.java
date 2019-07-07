package library.io.file;

import library.exception.NoSuchFiletypeException;
import library.io.ConsolePrinter;
import library.io.DataReader;

/**
 * @author n2god on 06/07/2019
 * @project Exercises
 */
public class FileManagerBuilder {
    private ConsolePrinter printer;
    private DataReader reader;

    public FileManagerBuilder(ConsolePrinter printer, DataReader reader) {
        this.printer = printer;
        this.reader = reader;
    }

    public FileManager build() throws NoSuchFiletypeException {
        printer.printLine("Wybierz format danych: ");
        FileType fileType = getFileType();
        switch (fileType){
            case SERIAL:
                return new SerializableFileManager();
            default:
                throw new NoSuchFiletypeException("Nieobsługiwany typ danych");
        }
    }

    private FileType getFileType() {
        boolean typeOk = false;
        FileType result = null;
        do {
            printTypes();
            String type = reader.getString().toUpperCase();
            try {
                result = FileType.valueOf(type);
                typeOk = true;
            } catch (IllegalArgumentException e) {
                printer.printLine("Nieobsługiwany typ danych, wybierz ponownie.");
            }
        } while (!typeOk);

        return result;
    }

    private void printTypes() {
        for(FileType value : FileType.values()){
            printer.printLine(value.name());
        }
    }


}

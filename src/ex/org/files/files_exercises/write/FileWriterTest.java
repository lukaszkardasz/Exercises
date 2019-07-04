package ex.org.files.files_exercises.write;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        String fileName = "testFile.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write("Gienek");
            writer.newLine();
            writer.write("Genowefa");
            writer.newLine();
            writer.write("Zdunek");
            writer.newLine();
            writer.write("Zbyszek");
            System.out.println("Zapisywanie pomyślne");
            writer.flush();
        } catch (IOException e) {
            System.err.println("Nie udało się zapisać pliku: " + fileName);
        }
    }
}

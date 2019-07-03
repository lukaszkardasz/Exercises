package ex.org.files.files_exercises;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileCreator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku: ");
        String fileName = scanner.nextLine();
        System.out.println("Podaj ścieżkę, gdzie utworzyć plik: ");
        String path = scanner.nextLine();
        scanner.close();
        String fileNameWithPath = path + File.separator + fileName;
        File file = new File(fileNameWithPath);
        file.getParentFile().mkdirs();

        boolean fileExists = file.exists();
        if (!fileExists){
            try {
                fileExists = file.createNewFile();
            } catch (IOException e) {
                System.out.println("Nie udało się utworzyć pliku " + fileNameWithPath);
            }
        }
        if(fileExists){
            System.out.println("Plik " + fileName + " już istnieje lub został utworzony.");
        }

    }
}

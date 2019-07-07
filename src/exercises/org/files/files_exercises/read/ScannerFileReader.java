package exercises.org.files.files_exercises.read;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFileReader {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "TestFile.txt";
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        int lines = 0;
        while(scanner.hasNextLine()){
            String name = scanner.nextLine();
            System.out.println(name);
            lines++;
        }
        System.out.println("imion: " + lines);
        scanner.close();
    }
}

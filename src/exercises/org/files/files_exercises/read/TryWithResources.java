package exercises.org.files.files_exercises.read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("testFile.txt"))){
            String nextLine;
            int lines = 0;
            while((nextLine = reader.readLine()) != null){
                System.out.println(nextLine);
                lines++;
            }
            System.out.println("Liczb: " + lines);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}

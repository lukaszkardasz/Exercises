package ex.org.files.files_exercises;

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
            System.out.println("imion: " + lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

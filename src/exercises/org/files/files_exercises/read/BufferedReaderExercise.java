package exercises.org.files.files_exercises.read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExercise {
    public static void main(String[] args) {
        String fileName = "testFile.txt";
        FileReader fileReader = null;
        BufferedReader reader = null;

        try {
            fileReader = new FileReader(fileName);
            reader = new BufferedReader(fileReader);
            String nextLine;
            int lines = 0;
            while((nextLine = reader.readLine()) != null){
                System.out.println(nextLine);
                lines++;
            }
            System.out.println("imion: " + lines);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

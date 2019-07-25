package exercises.org.stream.stream_exercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamStringExercise {
    private static final String PATH = "C:\\Java\\LibraryApp v4\\src\\exercises\\org\\stream\\stream_exercise\\loremipsum-129.txt";

    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(PATH));) {
            List<String> words = bufferedReader.lines()
                    .map(line -> line.split(" "))
                    .flatMap(Arrays::stream)
                    .collect(Collectors.toList());
        } catch (FileNotFoundException e) {
            System.err.println("Nie znaleziono pliku: " + PATH);
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Błąd wej/wyj");
        }
    }
}

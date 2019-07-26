package exercises.org.dateTime;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DateTimeExercise {
    public static void main(String[] args) {
        Instant actualTime = Instant.now();
        System.out.println(actualTime);

        Instant i1 = Instant.now();
        Stream.iterate(0, x -> x+1)
                .limit(200000)
                .map(DateTimeExercise::multiply)
                .forEach(System.out::print);
        Instant i2 = Instant.now();
        Duration timeGap = Duration.between(i1, i2);
        System.out.println();
        System.out.println("Pętla wykonała się w : " + timeGap.getSeconds() + " sekund");
    }

    private static <Integer> int multiply(int x) {
        return x * 3;
    }
}

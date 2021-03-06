package exercises.org.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExercise {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //Stream<Integer> stream = numbers.stream();

        //filtrujemy liczby podzielne przez 2;
        //stream.filter(x -> x % 2 == 0);

        //i np wieksze od 5
        //stream.filter(x -> x > 5);

        //stream.filter(x -> x % 2 == 0 && x > 5);

        numbers.stream()
                .filter(x -> x % 2 == 0 && x > 5)
                .collect(Collectors.toCollection(ArrayList::new))
                .forEach(System.out::println);

        Stream<String> stream = Stream.of("a", "aa", "b", "bb", "c", "cc");
        List<String> stringList = stream
                .peek(System.out::println)
                .map(String::toUpperCase)
                .peek(System.out::println)
                .collect(Collectors.toList());

        Stream<Integer> numStream = Stream.iterate(0, x -> x + 1);

        //limit liczb od 1 do 100
        List<Integer> squareNumbers = numStream
                .map(x -> x * x)
                .limit(100)
                .collect(Collectors.toList());

        //limit liczb

    }
}

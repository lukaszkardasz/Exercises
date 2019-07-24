package exercises.org.stream.stream_exercise;

import java.util.stream.Stream;

public class StreamEx {
    public static void main(String[] args) {
        Stream.iterate(0, x -> x + 1)
                .filter(x -> x > 100 && x < 1000 && x % 5 == 0)
                .limit(10)
                .map(x -> x * 3)
                .forEach(System.out::println);
    }
}

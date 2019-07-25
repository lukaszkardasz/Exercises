package exercises.org.stream;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NumberStreams {
    private static final int DIVIDER = 10;

    public static void main(String[] args) {

        //lista kwadratów kolejnych 100 liczb całkowitych
        List<Integer> squareNumbers = IntStream.range(0, 100)
                .map(NumberStreams::squareMethod)
                .boxed() // przerobienie IntStream na typ Stream<integer>
                .collect(Collectors.toList());

        //zbiór kwadratów liczb podzielnych przez 10 i dzielimy na 10 każdy z nich

        Set<Integer> biggerThan5 = squareNumbers.stream()
                .filter(NumberStreams::isDividedBy)
                .map(NumberStreams::divide)
                .collect(Collectors.toCollection(TreeSet<Integer>::new));

        System.out.println("Lista: ");
        squareNumbers.forEach(x -> System.out.print(x + "; "));
        System.out.println();
        System.out.println("Zbiór: ");
        biggerThan5.forEach(x -> System.out.print(x + "; "));
    }

    private static <Integer> int squareMethod(int x) {
        return x * x;
    }

    private static boolean isDividedBy(int x) {
        return x % DIVIDER == 0;
    }

    private static <Integer> int divide(int x) {
        return x / DIVIDER;
    }
}

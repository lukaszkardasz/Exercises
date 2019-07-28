package exercises.org.generics.exercise_generics;


import java.math.BigInteger;

/**
 * @author n2god on 11/07/2019
 * @project Exercises
 */
public class PairTest {

    public static void main(String[] args) {
        Pair<String, Integer> stringIntegerPair =
                new Pair<>("Anna", 5);
        Pair<Double, Character> doubleCharacterPair =
                new Pair<>(2.2, 'y');
        Pair<BigInteger, String> bigIntegerStringPair =
                new Pair<>(new BigInteger("500000000000000000000"), "duża liczba");

        printGenerics(stringIntegerPair);
        printGenerics(doubleCharacterPair);
        printGenerics(bigIntegerStringPair);
    }

    private static <T,V> void printGenerics(Pair<T,V> pair) {
        System.out.println("T: " + pair.getT() + " V: " + pair.getV());
    }
}

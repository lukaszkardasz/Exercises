package exercises.org.collections.iterators;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author n2god on 17/07/2019
 * @project Exercises
 */
public class TreeSetIterator {

    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(45);
        numbers.add(1);
        numbers.add(231);
        numbers.add(5);
        numbers.add(12);

        Iterator<Integer> numIterator = numbers.iterator();
        while (numIterator.hasNext()){
            int number = numIterator.next();
            System.out.println(number);
        }
    }
}

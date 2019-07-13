package exercises.org.collections.set;

import java.util.TreeSet;

/**
 * @author n2god on 13/07/2019
 * @project Exercises
 */
public class SetExercises {

    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(0);

        System.out.println("size: " + set.size());
        System.out.println("first: " + set.first());
        System.out.println("last: " + set.last());
        System.out.println("contains 2?: " + set.contains(2));
        for (Integer integer : set) {
            System.out.println(integer);
        }
    }
}

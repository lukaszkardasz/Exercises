package exercises.org.generics;

/**
 * @author n2god on 11/07/2019
 * @project Exercises
 */
public class GenericMethods {

    public static void main(String[] args) {

        print5Times(2);
        print5Times("Krzysio");
    }

    private static <T> void print5Times(T arg) {
        for (int i = 0; i < 5; i++) {
            System.out.println(arg);
        }
    }
}

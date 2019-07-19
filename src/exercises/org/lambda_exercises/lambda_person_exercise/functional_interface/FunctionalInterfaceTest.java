package exercises.org.lambda_exercises.lambda_person_exercise.functional_interface;

/**
 * @author n2god on 19/07/2019
 * @project Exercises
 */
public class FunctionalInterfaceTest {
    public static void main(String[] args) {
        Integer num = 5;
        num = increment(num, x -> x + 1);
        System.out.println(num);
    }

    public static <T> T increment (T t, IncrementalPrinter<T> ip){
        return ip.doSomething(t);
    }
}


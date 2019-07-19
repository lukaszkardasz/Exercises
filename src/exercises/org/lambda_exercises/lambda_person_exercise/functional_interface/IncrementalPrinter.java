package exercises.org.lambda_exercises.lambda_person_exercise.functional_interface;

/**
 * @author n2god on 19/07/2019
 * @project Exercises
 */
@FunctionalInterface
public interface IncrementalPrinter <T> {
    public T doSomething(T t);
}

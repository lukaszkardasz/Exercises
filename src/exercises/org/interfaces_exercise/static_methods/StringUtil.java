package exercises.org.interfaces_exercise.static_methods;

/**
 * @author n2god on 23/06/2019
 * @project Exercises
 */
public interface StringUtil {

    static String revert (String original){
        return new StringBuilder(original).reverse().toString();
    }

}

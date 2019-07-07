package exercises.org.recurrency;

/**
 * @author n2god on 07/07/2019
 * @project Exercises
 */
public class NormalNumberAdder {

    public static void main(String[] args) {
        int number = sum(30);
        System.out.println(number);
    }

    private static int sum(int n) {
        int sum = 0;
        while (n > 0){
            sum = sum + n;
            n--;
        }
        return sum;
    }
}

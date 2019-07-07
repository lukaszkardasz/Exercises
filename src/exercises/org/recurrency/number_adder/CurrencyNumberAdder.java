package exercises.org.recurrency.number_adder;

/**
 * @author n2god on 07/07/2019
 * @project Exercises
 */
public class CurrencyNumberAdder {

    public static void main(String[] args) {
        int number = sum(4582);
        System.out.println(number);
    }

    private static int sum(int n) {
        if (n > 1) {
            System.out.println(n + "+" + "sum(" + (n-1) + ")");
            return n + sum(n-1);
        }else {
            return n;
        }
    }
}

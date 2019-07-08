package exercises.org.recurrency.number_adder;

public class NumberAdder2 {

    public static void main(String[] args) {
        int number = sum(50000);
        System.out.println(number);
    }

    private static int sum(int n) {
        return n > 1 ? n + sum(n - 1) : n;
    }
}

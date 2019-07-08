package exercises.org.recurrency.strong;

public class StrongExercise {

    public static void main(String[] args) {
        int number = strong(5);
        System.out.println(number);
    }

    private static int strong(int n) {
        return n > 1 ? n * strong(n -1) : 1;
    }
}

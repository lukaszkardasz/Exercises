package exercises.org.lambda_exercises;

import java.util.function.Function;

public class LambdaExample {
    public static void main(String[] args) {
        String original = " WIELKI NAPIS ";

        //original = original.toLowerCase().trim();
        //System.out.println(original);


        //podejscie z lambda, przyjmuje String i zwraca String

        //tworzymy interfejs funkcyjnny
        Function<String, String> func = text -> text.toLowerCase().trim();

        //na funkcji func wywolujemy apply dla argumentu original
        String lowerCaseTrim = func.apply(original);

        System.out.println(lowerCaseTrim);
    }
}

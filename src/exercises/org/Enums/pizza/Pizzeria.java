package exercises.org.Enums.pizza;

import java.util.Scanner;

public class Pizzeria {

    public static void main(String[] args) {

        System.out.println("Pizze w pizzerii to: ");

        for (Pizza p : Pizza.values()) {
            System.out.println(p);
        }
        System.out.println("Jaką pizze wybierasz?");
        Scanner scanner = new Scanner(System.in);
        Pizza zamowionaPizza = Pizza.valueOf(scanner.nextLine()); // NAZWA PIZZY
        System.out.println("Dziękujemy za zamówienie pizzy " + zamowionaPizza.name()); // opis
        scanner.close();
    }
}

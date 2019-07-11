package exercises.org.arrays.comparable;

import java.util.Arrays;

/**
 * @author n2god on 11/07/2019
 * @project Exercises
 */
public class ProductCatalog {

    public static void main(String[] args) {
        Product[] products = new Product[7];
        products[0] = new Product("Amino", "Zupa pomidorowa", "Zupy");
        products[1] = new Product("Amino", "Zupa ogórkowa", "Zupy");
        products[2] = new Product("WINIARY", "Zupa pomidorowa", "Zupy");
        products[3] = new Product("WINIARY", "Zupa pomidorowa", "Zupy błyskawiczne");
        products[4] = new Product("WINIARY", "Rosół", "Zupy");
        products[5] = new Product("Knorr", "Placki ziemniaczane", "Dania obiadowe");
        products[6] = new Product("Knorr", "Racuchy", "Dania obiadowe");

        System.out.println("Nie posortowane: ");
        System.out.println();
        for (Product product : products) {
            System.out.println(product);
        }

        Arrays.sort(products);
        System.out.println("Posortowane: ");
        System.out.println();
        for (Product product : products) {
            System.out.println(product);
        }



    }
}

package exercises.org.arrays.comparator.anonymous_class;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author n2god on 11/07/2019
 * @project Exercises
 */
public class ProductCatalogue {

    public static void main(String[] args) {
        Product[] products = new Product[7];
        products[0] = new Product("Aminok", "Zupa pomidorowa", "Zupy");
        products[1] = new Product("Aminok", "Zupa ogórkowa", "Zupy");
        products[2] = new Product("WINIAR", "Zupa pomidorowa", "Zupy");
        products[3] = new Product("WINIAR", "Zupa pomidorowa", "Zupy błyskawiczne");
        products[4] = new Product("WINIAR", "Rosół", "Zupy");
        products[5] = new Product("Knorek", "Placki ziemniaczane", "Dania obiadowe");
        products[6] = new Product("Knorek", "Racuchy", "Dania obiadowe");

        System.out.println("Nie posortowane: ");
        System.out.println();
        for (Product p : products) {
            System.out.println(p);
        }


        System.out.println("Posortowane po producencie:");
        Arrays.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getProducer().compareTo(p2.getProducer());
            }
        });
        System.out.println();
        for (Product p : products) {
            System.out.println(p);
        }
    }
}

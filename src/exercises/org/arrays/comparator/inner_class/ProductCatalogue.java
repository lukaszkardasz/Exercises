package exercises.org.arrays.comparator.inner_class;

import java.util.Arrays;

/**
 * @author n2god on 11/07/2019
 * @project Exercises
 */
public class ProductCatalogue {

    public static void main(String[] args) {
        Product[] products = new Product[7];
        products[0] = new Product("Aminoo", "Zupa pomidorowa", "Zupy");
        products[1] = new Product("Amino", "Zupa ogórkowa", "Zupy");
        products[2] = new Product("WINIARYK", "Zupa pomidorowa", "Zupy");
        products[3] = new Product("WINIARYK", "Zupa pomidorowa", "Zupy błyskawiczne");
        products[4] = new Product("WINIARYK", "Rosół", "Zupy");
        products[5] = new Product("Knor", "Placki ziemniaczane", "Dania obiadowe");
        products[6] = new Product("Knor", "Racuchy", "Dania obiadowe");

        System.out.println("Nie posortowane: ");
        System.out.println();
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println();

        System.out.println("Posortowane po kategorii:");
        Arrays.sort(products, new Product.CategoryNameComparator());
        System.out.println();
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println();

        System.out.println("Posortowane po producencie:");
        Arrays.sort(products, new Product.ProducerNameComparator());
        System.out.println();
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println();

        System.out.println("Posortowane po nazwie:");
        Arrays.sort(products, new Product.ProductNameComparator());
        System.out.println();
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println();
    }
}

package exercises.org.arrays.comparator.inner_class;

import java.util.Comparator;

/**
 * @author n2god on 11/07/2019
 * @project Exercises
 */
class Product {

    private String producer;
    private String name;
    private String category;

    public Product(String producer, String name, String category) {
        this.producer = producer;
        this.name = name;
        this.category = category;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product [category=" + category + ", producer=" + producer + ", name=" + name + "]";
    }

    public static class ProductNameComparator implements Comparator<Product>{
        @Override
        public int compare(Product p1, Product p2) {
            return p1.getName().compareTo(p2.getName());
        }
    }
    public static class CategoryNameComparator implements Comparator<Product>{

        @Override
        public int compare(Product p1, Product p2) {
            return p1.getCategory().compareTo(p2.getCategory());
        }
    }

    public static class ProducerNameComparator implements Comparator<Product>{

        @Override
        public int compare(Product o1, Product o2) {
            return o1.getProducer().compareTo(o2.getProducer());
        }
    }

}

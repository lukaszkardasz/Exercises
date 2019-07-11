package exercises.org.arrays.comparable;

/**
 * @author n2god on 11/07/2019
 * @project Exercises
 */
class Product implements Comparable<Product> {

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

    @Override
    public int compareTo(Product p) {
        int categoryCompare = category.compareTo(p.getCategory());
        if (categoryCompare != 0){
            return categoryCompare;
        }

        int producerCompare = producer.compareTo(p.getProducer());
        if (producerCompare != 0){
            return producerCompare;
        }
        return name.compareTo(p.getName());
    }
}

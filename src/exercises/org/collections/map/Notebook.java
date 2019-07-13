package exercises.org.collections.map;

import java.util.Objects;

/**
 * @author n2god on 13/07/2019
 * @project Exercises
 */
public class Notebook {
    private String producer;
    private String model;

    public Notebook(String producer, String model) {
        this.producer = producer;
        this.model = model;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return Objects.equals(getProducer(), notebook.getProducer()) &&
                Objects.equals(getModel(), notebook.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProducer(), getModel());
    }

    @Override
    public String toString() {
        return "Notebook[" + "producer='" + producer + ", model='" + model + ']';
    }
}

package exercises.org.generics.exercise_generics;

/**
 * @author n2god on 11/07/2019
 * @project Exercises
 */
public class  Pair <T, V>{
    private T t;
    private V v;

    public Pair(T t, V v) {
        this.t = t;
        this.v = v;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    @Override
    public String toString() {
        return "Para{" +
                "t=" + t +
                ", v=" + v +
                '}';
    }
}

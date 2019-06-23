package ex.org.abstract_class;

/**
 * @author n2god on 23/06/2019
 * @project Exercises
 */
public class Plane extends Vehicle {
    @Override
    public void speedUp() {
        setSpeed(getSpeed()+ 5);
    }
}

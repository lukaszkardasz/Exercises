package exercises.org.abstract_class;

/**
 * @author n2god on 23/06/2019
 * @project Exercises
 */
public class PlaneApp{

    public static void main(String[] args) {
        //Vehicle vehicle = new Vehicle();
        //abstract

        Vehicle vehicle = new Plane();
        vehicle.speedUp();
        System.out.println("Samolot porusza się z prędkością: " + vehicle.getSpeed());
    }
}

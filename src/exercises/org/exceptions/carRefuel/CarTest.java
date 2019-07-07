package exercises.org.exceptions.carRefuel;

/**
 * @author n2god on 20/06/2019
 * @project org
 */
public class CarTest {

    public static void main(String[] args) {
        Car car = new Car();
        try {
            car.refuel(40);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        System.out.println(car);

        try {
            car.drive();
            System.out.println(car);
            car.drive();
            System.out.println(car);
            car.drive();
            System.out.println(car);
            car.drive();
            System.out.println(car);
            car.drive();
            System.out.println(car);
            car.drive();
        } catch (IllegalStateException e) {
            System.err.println(e.getMessage());
        }
        System.out.println(car);
    }
}

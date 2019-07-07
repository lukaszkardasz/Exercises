package exercises.org.exceptions.carRefuel;

/**
 * @author n2god on 20/06/2019
 * @project org
 */
public class Car {

    private static final double FUEL_CONSUMPTION = 8; //8l/100km
    private static final double MAX_FUEL = 50; //8l/100km

    private double fuel;

    public void refuel (double additionalFuel){
        if (fuel + additionalFuel > MAX_FUEL) {
            throw new IllegalArgumentException("Nie możesz aż tyle zatankować, wejdzie maksymalnie " + MAX_FUEL);
        } else {
            fuel += additionalFuel;
        }
    }

    public void drive(){
        if (fuel - FUEL_CONSUMPTION < 0) {
            throw new IllegalStateException("Za mało paliwa na podróż, tankuj!");
        } else{
            fuel -=FUEL_CONSUMPTION;
        }
    }

    @Override
    public String toString() {
        return "Stan paliwa: " + fuel;
    }
}

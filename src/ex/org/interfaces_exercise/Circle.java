package ex.org.interfaces_exercise;

/**
 * @author n2god on 23/06/2019
 * @project Exercises
 */
public class Circle implements Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }


    @Override
    public double calculateArea() {
        return Shape.PI * Math.pow(r, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Shape.PI * r;
    }
}

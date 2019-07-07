package exercises.org.interfaces_exercise.inteface_calculator.logic;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + radius +
                '}'+
                " pole= " + calculateArea() +
                ", obwod= " + calculatePerimeter();
    }


    @Override
    public double calculateArea() {
        return PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }
}

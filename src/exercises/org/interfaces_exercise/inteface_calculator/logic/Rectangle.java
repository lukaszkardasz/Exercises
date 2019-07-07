package exercises.org.interfaces_exercise.inteface_calculator.logic;

public class Rectangle implements Shape {
    private double rectangleA;
    private double rectangleB;

    public Rectangle(double rectangleA, double rectangleB) {
        this.rectangleA = rectangleA;
        this.rectangleB = rectangleB;
    }

    public double getRectangleA() {
        return rectangleA;
    }

    public void setRectangleA(double rectangleA) {
        this.rectangleA = rectangleA;
    }

    public double getRectangleB() {
        return rectangleB;
    }

    public void setRectangleB(double rectangleB) {
        this.rectangleB = rectangleB;
    }

    @Override
    public double calculateArea() {
        return rectangleA * rectangleB;
    }

    @Override
    public double calculatePerimeter() {
        return (2 * rectangleA) + (2 * rectangleB);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "A=" + rectangleA +
                ", B=" + rectangleB +
                '}'+
                " pole= " + calculateArea() +
                ", obwod= " + calculatePerimeter();
    }
}

package ex.org.interfaces_exercise.inteface_calculator.logic;

public class Triangle implements Shape {


    private double triangleA;
    private double triangleB;
    private double triangleC;

    public Triangle(double triangleA, double triangleB, double triangleC) {
        this.triangleA = triangleA;
        this.triangleB = triangleB;
        this.triangleC = triangleC;
    }

    public double getTriangleA() {
        return triangleA;
    }

    public void setTriangleA(double triangleA) {
        this.triangleA = triangleA;
    }

    public double getTriangleB() {
        return triangleB;
    }

    public void setTriangleB(double triangleB) {
        this.triangleB = triangleB;
    }

    public double getTriangleC() {
        return triangleC;
    }

    public void setTriangleC(double triangleC) {
        this.triangleC = triangleC;
    }

    @Override
    public double calculateArea() {
        return (triangleA + triangleB + triangleC) / 2;
    }

    @Override
    public double calculatePerimeter() {
        return triangleA + triangleB + triangleC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "A=" + triangleA +
                ", B=" + triangleB +
                ", C=" + triangleC +
                '}' +
                " pole= " + calculateArea() +
                ", obwod= " + calculatePerimeter();
    }
}

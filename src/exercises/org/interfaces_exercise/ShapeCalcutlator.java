package exercises.org.interfaces_exercise;

/**
 * @author n2god on 23/06/2019
 * @project Exercises
 */
public class ShapeCalcutlator {

    public static void main(String[] args) {
        Shape prostokat = new Rectangle(5,3);
        Shape kolko = new Circle(3);

        System.out.println("Pole prostokąta o bokach: " + ((Rectangle)prostokat).getA() + ", " + ((Rectangle)prostokat).getB() + " = " + prostokat.calculateArea() + ", obwod: " + prostokat.calculatePerimeter());
        System.out.println("Pole kola o promieniu: " + ((Circle)kolko).getR() + " = " + kolko.calculateArea() + ", obwod: " + kolko.calculatePerimeter());
    }
}

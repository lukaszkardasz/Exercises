package ex.org.point.app;

import ex.org.point.data.Point;
import ex.org.point.controller.PointController;

/**
 * @author n2god on 07/06/2019
 * @project org
 */
public class PointApplication {

    private static final int ADD_X = 0;
    private static final int ADD_Y = 1;
    private static final int MINUS_X = 2;
    private static final int MINUS_Y = 3;

    public static void main(String[] args) {

        Point point = new Point(17,17);
        PointController pc = new PointController();
        System.out.println("Punkt przed zmianami: (" + point.getxPosition() + ", " + point.getyPosition() +")");

        int option = MINUS_Y;

        switch(option){

            case ADD_X:
                pc.addX(point);
                break;
            case ADD_Y:
                pc.addY(point);
                break;
            case MINUS_X:
                pc.minusX(point);
                break;
            case MINUS_Y:
                pc.minusY(point);
                break;
            default:
                System.out.println("Podano błędną wartość.");
        }

        System.out.println("Punkt po zmianach: (" + point.getxPosition() + ", " + point.getyPosition() + ")");
    }
}

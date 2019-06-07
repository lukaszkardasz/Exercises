package Exercises.Point.app;

import Exercises.Point.controller.PointController;
import Exercises.Point.data.Point;

/**
 * @author n2god on 07/06/2019
 * @project Exercises
 */
public class PointApplication {

    public static void main(String[] args) {

        Point point = new Point(4,5);

        PointController pc = new PointController();
        System.out.println("Punkt 1: (" + point.getxPosition() + ", " + point.getyPosition() + ")");
        pc.addX(point);
        pc.addY(point);
        System.out.println("Punkt 1: (" + point.getxPosition() + ", " + point.getyPosition() + ")");
        pc.minusX(point);
        pc.minusY(point);
        System.out.println("Punkt 1: (" + point.getxPosition() + ", " + point.getyPosition() + ")");
    }
}

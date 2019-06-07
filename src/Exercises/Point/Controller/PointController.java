package Exercises.Point.Controller;

import Exercises.Point.Data.Point;

/**
 * @author n2god on 07/06/2019
 * @project Exercises
 */
public class PointController {

    public void addX(Point point){
        point.setxPosition(point.getxPosition() + 1);
    }

    public void minusX (Point point){
        point.setxPosition(point.getxPosition() - 1);
    }

    public void addY(Point point){
        point.setxPosition(point.getyPosition() + 1);
    }

    public void minusY (Point point){
        point.setxPosition(point.getyPosition() - 1);
    }

}

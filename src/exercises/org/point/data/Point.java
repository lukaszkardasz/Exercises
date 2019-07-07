package exercises.org.point.data;

/**
 * @author n2god on 07/06/2019
 * @project org
 */
public class Point {

    private int xPosition;
    private int yPosition;

    Point(){

    }

    public Point(int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }
}

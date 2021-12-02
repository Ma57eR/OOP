package Abstract.PointRectangle;

public class Rectangle {
    private Point bottomLeft;
    private Point topRight;

    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public Point getBottomLeft() {
        return bottomLeft;
    }

    public Point getTopRight() {
        return topRight;
    }

    public boolean contains (Point point) {
        if (bottomLeft.getX() <= point.getX() && topRight.getX() >= point.getX()) {
            if (bottomLeft.getY() <= point.getY() && topRight.getY() >= point.getY()) {
                return true;
            }
        }
        return false;
    }

}



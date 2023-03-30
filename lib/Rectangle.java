public class Rectangle extends shape {
    private double width;
    private double height;
    public String name = "Rectangle";

    public Rectangle(Posn center, double width, double height) {
        super(center);
        this.width = width;
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public boolean contains(Posn pos) {
        double halfWidth = width / 2.0;
        double halfHeight = height / 2.0;
        double xDiff = Math.abs(getCenter().getX() - pos.getX());
        double yDiff = Math.abs(getCenter().getY() - pos.getY());
        return xDiff <= halfWidth && yDiff <= halfHeight;
    }
}

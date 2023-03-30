public class Circle extends shape {
    private double radius;
    private String name = "Circle";

    public Circle(Posn center, double radius) {
        super(center);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public boolean contains(Posn pos) {
        double xDiff = getCenter().getX() - pos.getX();
        double yDiff = getCenter().getY() - pos.getY();
        double distance = Math.sqrt(xDiff * xDiff + yDiff * yDiff);
        return distance <= radius;
    }
}

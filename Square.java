public class Square extends shape {
    private double sideLength;

    public Square(Posn center, double sideLength) {
        super(center);
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    @Override
    public double perimeter() {
        return 4 * sideLength;
    }

    @Override
    public double area() {
        return sideLength * sideLength;
    }

    @Override
    public boolean contains(Posn pos) {
        double halfSideLength = sideLength / 2.0;
        double xDiff = Math.abs(getCenter().getX() - pos.getX());
        double yDiff = Math.abs(getCenter().getY() - pos.getY());
        return xDiff <= halfSideLength && yDiff <= halfSideLength;
    }
}


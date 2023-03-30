public abstract class shape {
    private Posn center;

    public shape(Posn center) {
        this.center = center;
    }

    public Posn getCenter() {
        return center;
    }

    public abstract String getShapeName();

    public abstract double perimeter();

    public abstract double area();

    public abstract boolean contains(Posn pos);
}

package core.basesyntax;

public class Circle extends Figure {

    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {

        System.out.println("Figure: " + getClass().getSimpleName() + ", area: "
                + getArea() + " sq.units, color: " + getColor() + ", radius: " + radius);
    }

    @Override
    public double getArea() {
        return (radius * radius) * 3.14;
    }
}

package homework6.Figure;

public class Сircle extends Figure {
    public int radius;

    public Сircle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void sendPerimeter() {
        System.out.println("Периметер кола = " + radius);
    }

    @Override
    public String toString() {
        return "Сircle{" +
                "radius=" + radius +
                "} " + super.toString();
    }
}

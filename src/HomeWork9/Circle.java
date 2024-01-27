package HomeWork9;

public class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        int area = getRadius() * getRadius();
        System.out.println("Площа круга: " + area*3.14);
        return 0;
    }

    @Override
    public double perimeter() {
        System.out.println("Периметр: " + getRadius());
        return 0;
    }

    @Override
    public void display() {
        System.out.println("Це коло");
    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}

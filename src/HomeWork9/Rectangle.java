package HomeWork9;

public class Rectangle implements Shape{
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double area() {
        System.out.println("Площа: " + getWidth()*getHeight());
        return 0;
    }

    @Override
    public double perimeter() {
        System.out.println("Периметер: " + (getHeight()+getWidth())*2);
        return 0;
    }

    @Override
    public void display() {
        System.out.println("Це прямокутник");
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}

package HomeWork9;

public class Application {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 6);
        Circle circle = new Circle(8);

        rectangle.perimeter();
        rectangle.area();
        circle.area();
        circle.display();
        rectangle.display();

    }
}

package homework4;

public class Application {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(14, 16);

        System.out.println("Довжина прямокутника: " + rectangle.getLength());
        System.out.println("Ширина прямокутника: " + rectangle.getWidth());
        rectangle.perimeter();
        rectangle.area();
    }
}

package homework4;

public class Aplication {
    public static void main(String[] args) {
        rectangle rectangle = new rectangle(14, 16);

        System.out.println("Довжина прямокутника: " + rectangle.getLength());
        System.out.println("Ширина прямокутника: " + rectangle.getWidth());
        rectangle.Perimeter();
        rectangle.Area();
    }
}

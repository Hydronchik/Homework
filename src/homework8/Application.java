package homework8;

public class Application {

    public static void main(String[] args) {
     Car car = new Car("bugati", "xz", 2006);
     Motorcycle motorcycle = new Motorcycle("Kavasaki", "xz", 2021);

     car.service();
     motorcycle.service();
    }

}

package less6.Mashine;

public class Application {
    public static void main(String[] args){
        Car car = new Car("Passenger car","ModelX", new Engine("strong"), new Driver(41, "Oleksandr"));
        System.out.println(car);
    }
}

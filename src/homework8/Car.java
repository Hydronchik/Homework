package homework8;

public class Car extends Vehicle{

    public Car(String brande, String model, int year) {
        super(brande, model, year);
    }
    public void service() {
        System.out.println("Манина");
    }

    @Override
    public String toString() {
        return "Car{} " + super.toString();
    }
}

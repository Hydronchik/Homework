package homework8;

public class Motorcycle extends Vehicle{
    public Motorcycle(String brande, String model, int year) {
        super(brande, model, year);
    }

    public void service() {
        System.out.println("Мотоцикл");
    }
}

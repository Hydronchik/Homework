package homework13;

public class Car {
    private  int horsePower;
    private int yearOfRelease;

    public Car(int horsePower, int yearOfRelease) {
        this.horsePower = horsePower;
        this.yearOfRelease = yearOfRelease;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }
    public static void newCar(int horsePower, int yearOfRelease){
        Car car = new Car(yearOfRelease, horsePower);
        System.out.println("Твоя машина: " + car);
    }
    @Override
    public String toString() {
        return "Car{" +
                "horsePower=" + horsePower +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }
}

package less6.Mashine;

public class Car extends Vehicle{
    public String model;
    public Engine engine;
    public Driver driver;

    public Car(String type, String model, Engine engine, Driver driver) {
        super(type);
        this.model = model;
        this.engine = engine;
        this.driver = driver;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", engine=" + engine +
                ", driver=" + driver +
                "} " + super.toString();
    }
}

package homework6.Composition.Car;

public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public void engineOff(){
        engine.engineOff();
    }
    public void engineOn(){
        engine.engineOn();
    }
}

package less6.Mashine;

public class Engine {
    public  String engineModel;

    public Engine(String engineModel) {
        this.engineModel = engineModel;
    }

    public String getEngineModel() {
        return engineModel;
    }

    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engineModel='" + engineModel + '\'' +
                '}';
    }
}

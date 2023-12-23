package homework5.robot.car;

public class Steering {
    private String tire;

    public Steering(String tire) {
        this.tire = tire;
    }

    public String getTire() {
        return tire;
    }

    public void setTire(String tire) {
        this.tire = tire;
    }

    @Override
    public String toString() {
        return "Steering{" +
                "tire='" + tire + '\'' +
                '}';
    }
}

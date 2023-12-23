package homework5.robot.car;

public class car {
    private String type;
    private double price;
    private Steering steering;
    private Wheel wheel;
    private Body body;

    public car(String type, double price, Steering steering, Wheel wheel, Body body) {
        this.type = type;
        this.price = price;
        this.steering = steering;
        this.wheel = wheel;
        this.body = body;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Steering getSteering() {
        return steering;
    }

    public void setSteering(Steering steering) {
        this.steering = steering;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "car{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", steering=" + steering +
                ", wheel=" + wheel +
                ", body=" + body +
                '}';
    }
}

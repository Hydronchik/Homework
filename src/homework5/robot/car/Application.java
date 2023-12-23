package homework5.robot.car;

public class Application {
    public static void main(String[] args){
        Steering steering = new Steering("Winter");
        Wheel wheel = new Wheel(30);
        Body body = new Body("red");
        car car = new car("TeslaX", 10000.99, steering, wheel, body);

        System.out.println(car);
        wheel.newWeel();
        body.newColor();
        System.out.println(car);
    }
}

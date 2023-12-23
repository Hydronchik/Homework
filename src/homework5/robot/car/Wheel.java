package homework5.robot.car;

public class Wheel {
    private int radius;

    public Wheel(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void newWeel() {
        radius += 50;
        System.out.println("Ти поміняв колеса тепер їх радіус: "+ radius);
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "radius=" + radius +
                '}';
    }
}

package homework5.robot.car;

public class Body {
    private String color;

    public Body(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void newColor(){
        color = "black";
        System.out.println("Ти змінив колір кузова тепер він: "+ color);
    }

    @Override
    public String toString() {
        return "Body{" +
                "color='" + color + '\'' +
                '}';
    }
}

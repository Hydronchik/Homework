package less5s2;

public class Tshirt {
    private String color;

    public Tshirt(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Tshirt{" +
                "color='" + color + '\'' +
                '}';
    }
}

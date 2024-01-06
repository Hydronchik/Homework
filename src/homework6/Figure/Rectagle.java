package homework6.Figure;

public class Rectagle extends Figure {
    public int length;
    public int weight;

    public Rectagle(int length, int weight) {
        this.length = length;
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void sendPerimeter() {
        System.out.println("Периметер прямокутника = " + length * weight);
    }

    @Override
    public String toString() {
        return "Rectagle{" +
                "length=" + length +
                ", weight=" + weight +
                "} " + super.toString();
    }
}

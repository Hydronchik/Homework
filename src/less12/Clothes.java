package less12;

public abstract class Clothes {
    private Sizes size;
    private  String color;
    private int cost;

    public Clothes(Sizes size, String color, int cost) {
        this.size = size;
        this.color = color;
        this.cost = cost;
    }

    public Sizes getSize() {
        return size;
    }

    public void setSize(Sizes size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "size=" + size +
                ", color='" + color + '\'' +
                ", cost=" + cost +
                '}';
    }
}

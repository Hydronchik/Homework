package less14;

import java.util.List;

public class Caffe {
    private String name;
    private int price;
    private List<Sizes> sizes;

    public Caffe(String name, int price, List<Sizes> sizes) {
        this.name = name;
        this.price = price;
        this.sizes = sizes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<Sizes> getSizes() {
        return sizes;
    }

    public void setSizes(List<Sizes> sizes) {
        this.sizes = sizes;
    }

    @Override
    public String toString() {
        return "Caffe{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", sizes=" + sizes +
                '}';
    }
}

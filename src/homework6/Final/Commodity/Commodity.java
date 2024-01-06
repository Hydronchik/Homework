package homework6.Final.Commodity;

public final class Commodity {//Цей клас не можна унаслідовати бо там фінал стоїть
    public double price;
    public String name;

    public Commodity(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}

package homework8;

public abstract class Vehicle {
    private String brande;
    private String model;
    private int year;

    public Vehicle(String brande, String model, int year) {
        this.brande = brande;
        this.model = model;
        this.year = year;
    }

    public String getBrande() {
        return brande;
    }

    public void setBrande(String brande) {
        this.brande = brande;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public abstract void service();

    @Override
    public String toString() {
        return "Vehicle{" +
                "brande='" + brande + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}

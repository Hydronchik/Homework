package less5s2;

public class Human {
    private String name;
    private int age;
    private  Sorts sorts;
    private Tshirt tshirt;

    public Human(String name, int age, Sorts sorts, Tshirt tshirt) {
        this.name = name;
        this.age = age;
        this.sorts = sorts;
        this.tshirt = tshirt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sorts getSorts() {
        return sorts;
    }

    public void setSorts(Sorts sorts) {
        this.sorts = sorts;
    }

    public Tshirt getTshirt() {
        return tshirt;
    }

    public void setTshirt(Tshirt tshirt) {
        this.tshirt = tshirt;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sorts=" + sorts +
                ", tshirt=" + tshirt +
                '}';
    }
}

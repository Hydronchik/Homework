package less5;

public class Dog extends Animal{
    private String breed;

    public Dog(int age, String name, String breed) {
        super(age, name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                "} " + super.toString();
    }
}

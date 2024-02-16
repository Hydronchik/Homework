package homework12;

public class Dog extends Animal{
    private String breed;

    public Dog(String food, String locate, String breed) {
        super(food, locate);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }


    public void makeNoice() {
        System.out.println("гав");
    }


    public void Eat() {
        System.out.println("кісточку");
    }


    public void Sleep() {

    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                "} " + super.toString();
    }
}

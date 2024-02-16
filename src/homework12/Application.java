package homework12;

public class Application {
    public static void main(String[] args) {
        Veterinarian veterinarian = new Veterinarian();
        Dog dog = new Dog("meat","Europe", "xz");
        Cat cat = new Cat("fish","USA","black");
        Horse horse = new Horse("Grass","Austria",1000);
        veterinarian.treatAnimal(cat);
        veterinarian.treatAnimal(dog);
        veterinarian.treatAnimal(horse);
        System.out.println("===============================");
        cat.Eat();
        dog.makeNoice();
        horse.Eat();
        horse.makeNoice();
    }
}

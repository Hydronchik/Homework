package less12;

public class Skirt extends Clothes implements FemaleClothes{

    public Skirt(Sizes size, String color, int cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "Skirt{} " + super.toString();
    }
}

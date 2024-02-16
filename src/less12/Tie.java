package less12;

public class Tie extends Clothes implements MaleClothes{
    public Tie(Sizes size, String color, int cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "Tie{} " + super.toString();
    }
}

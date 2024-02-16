package less12;

public class TeeShirt extends Clothes implements MaleClothes,FemaleClothes{


    public TeeShirt(Sizes size, String color, int cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "TeeShirt{} " + super.toString();
    }
}

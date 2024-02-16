package less12;

public class Main {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new TeeShirt(Sizes.S, "green", 2000),
                new Tie(Sizes.XL, "red", 10),
                new Skirt(Sizes.M, "blue", 5000)
        };
        DressMakingStudio dressMakingStudio = new DressMakingStudio();
        dressMakingStudio.dressFemale(clothes );
        System.out.println("===========================");
        dressMakingStudio.dressMale(clothes);
    }
}

package coffemaker;

public class Application {
    public static void main(String[] args) {
        LatteMaker latteMaker = new LatteMaker();
        CoffeMashine coffeMashine = new CoffeMashine(latteMaker);
        coffeMashine.makeCoffe();
    }



}

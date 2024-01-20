package coffemaker;

public class CoffeMashine {
    public CoffeMaker coffeMaker;
    public CoffeMashine(CoffeMaker coffeMaker) {
        this.coffeMaker = coffeMaker;
    }
    public void makeCoffe(){
        coffeMaker.makeCoffe();
    }
}

package less14;

public enum Sizes {
    S(150),
    M(250),
    L(350),
    XL(450);
    private final int volume;

    Sizes(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }
}

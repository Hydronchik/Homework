package less14;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Caffe> availableCaffe = new ArrayList<>();

    public Menu() {
        availableCaffe.add(new Caffe("Americano", 2, List.of(Sizes.XL,Sizes.L, Sizes.M)));
        availableCaffe.add(new Caffe("Capuchino", 4, List.of(Sizes.L,Sizes.S)));
        availableCaffe.add(new Caffe("Latte", 2, List.of(Sizes.L, Sizes.S, Sizes.M)));
    }


    public List<Caffe> getAvailableCaffe() {
        return availableCaffe;
    }

    public void setAvailableCaffe(List<Caffe> availableCaffe) {
        this.availableCaffe = availableCaffe;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "availableCaffe=" + availableCaffe +
                '}';
    }
}

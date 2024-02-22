package less13;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human("Danik", 2));
        humans.add(new Human("Rostik", 5));
        humans.add(new Human("Bogdan", 6));
        for (Human h : humans){
            if (h.getAge() % 2 == 0){
            System.out.println(h);
            }
        }


    }
}

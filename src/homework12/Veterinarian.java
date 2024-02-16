package homework12;

import java.util.Arrays;

public class Veterinarian {


    public Veterinarian() {
    }

    public void treatAnimal(Animal animal){
        System.out.println(animal);
    }

    @Override
    public String toString() {
        return "Veterinarian{}";
    }
}

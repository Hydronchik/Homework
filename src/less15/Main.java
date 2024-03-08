package less15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Audi", 10000, 200000));
        cars.add(new Car("BMW", 7000, 134004));
        cars.add(new Car("Mercedes", 15000, 156000));
        Iterator<Car> iterator = cars.iterator();
        while (iterator.hasNext()){
            Car car = iterator.next();
            if (car.getPrice() == 7000){
                iterator.remove();
            }

        }
        for (Car c : cars){
            System.out.println(c);
        }
    }
}

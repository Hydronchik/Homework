package homework13;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void menu(){
        System.out.println("=================MENU=================");
        System.out.println("1 - Список машин");
    }

    public static void main(String[] args) {
        Scanner mainScanner = new Scanner(System.in);
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1000, 2020));
        cars.add(new Car(510, 2010));
        cars.add(new Car(275, 2001));
        cars.add(new Car(351, 1990));

        while (true){
            menu();
            String mainCode = mainScanner.next();
            switch (mainCode){
                case "1" -> {
                    System.out.println(cars);

                }
                case "2" -> {
                    for (Car c : cars){
                        int index = 0;
                        index ++;
                        cars.get(index).setHorsePower(cars.get(0).getHorsePower());
                        cars.get(index).setYearOfRelease(cars.get(0).getYearOfRelease());
                    }
                    System.out.println(cars);
                }
            }



        }

    }
}

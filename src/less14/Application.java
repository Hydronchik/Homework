package less14;

import java.util.List;
import java.util.Scanner;

public class Application {
    public static void menu(){
        int i = 0;
        Menu menus = new Menu();
        System.out.println("===================Menu======================");
        for (Caffe c : menus.getAvailableCaffe()){
            System.out.println("====================["+ (i+1) +"]========================");
            System.out.println(menus.getAvailableCaffe().get(i).getName());
            System.out.println(" Ціна:" + menus.getAvailableCaffe().get(i).getPrice());
            System.out.println("  Доступні розміри:" + menus.getAvailableCaffe().get(i).getSizes());

            i ++;
        }
        System.out.println("====================["+ (i+1) +"]========================");
        System.out.println("Подивитися список замовлень");
    }
    public static void main(String[] args) {
        Order order = new Order();
        menu();
        Scanner mainScanner = new Scanner(System.in);
        while (true){

            String mainCode = mainScanner.next();
            switch (mainCode){
                case "1" ->{
                    System.out.println("Виберіть розмір: ");
                    String sizeCaffeAmericano = mainScanner.next();
                    if (sizeCaffeAmericano == "XL"){
                    order.createOrder(new Caffe("Americano", 2, List.of(Sizes.XL)));
                    } else if (sizeCaffeAmericano == "L") {
                        order.createOrder(new Caffe("Americano", 2, List.of(Sizes.L)));
                    }else if (sizeCaffeAmericano == "M") {
                        order.createOrder(new Caffe("Americano", 2, List.of(Sizes.M)));
                }else {
                        System.out.println("Такого розміру немає:<");

                    }
                    break;
                }
                case "2" ->{
                    System.out.println("Виберіть розмір: ");
                    String sizeCaffeCapuchino = mainScanner.next();
                    if (sizeCaffeCapuchino == "S"){
                        order.createOrder(new Caffe("Capuchino", 4, List.of(Sizes.S)));
                    } else if (sizeCaffeCapuchino == "L") {
                        order.createOrder(new Caffe("Capuchino", 4, List.of(Sizes.L)));

                    }else {
                        System.out.println("Такого розміру немає:<");

                    }
                    break;
                }
                case "3" ->{
                    System.out.println("Виберіть розмір: ");
                    String sizeCaffeLatte = mainScanner.next();
                    if (sizeCaffeLatte == "S"){
                        order.createOrder(new Caffe("Capuchino", 2, List.of(Sizes.S)));
                    } else if (sizeCaffeLatte == "L") {
                        order.createOrder(new Caffe("Capuchino", 2, List.of(Sizes.L)));

                    }else if (sizeCaffeLatte == "M") {
                        order.createOrder(new Caffe("Capuchino", 2, List.of(Sizes.M)));

                    }else {
                        System.out.println("Такого розміру немає:<");

                    }
                    break;
                }
            }

        }
    }
}

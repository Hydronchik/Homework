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
        System.out.println("-------Подивитися список замовлень---------");
    }
    public static void main(String[] args) {
        Order order = new Order();
        menu();
        Scanner mainScanner = new Scanner(System.in);
        while (true){
            System.out.println("Введіть номер: ");
            String mainCode = mainScanner.next();
            switch (mainCode){
                case "1" ->{
                    System.out.println("Виберіть розмір: ");
                    Scanner scanner = new Scanner(System.in);
                    String sizeCaffeAmericano = scanner.next();
                    switch (sizeCaffeAmericano){
                        case "XL"->{
                            order.createOrder(new Caffe("Americano", 2, List.of(Sizes.XL)));
                            System.out.println("Кава Americano розміру XL додана до вашого кошика");
                        }
                        case "L"->{
                            order.createOrder(new Caffe("Americano", 2, List.of(Sizes.L)));
                            System.out.println("Кава Americano розміру L додана до вашого кошика");
                        }
                        case "M"->{
                            order.createOrder(new Caffe("Americano", 2, List.of(Sizes.M)));
                            System.out.println("Кава Americano розміру M додана до вашого кошика");
                        }

                    }
                    break;
                }
                case "2" ->{
                    System.out.println("Виберіть розмір: ");
                    Scanner scanner = new Scanner(System.in);
                    String sizeCaffeCapuchino = scanner.next();
                    switch (sizeCaffeCapuchino){
                        case "S"->{
                            order.createOrder(new Caffe("Capuchino", 4, List.of(Sizes.S)));
                            System.out.println("Кава Capuchino розміру S додана до вашого кошика");
                        }
                        case "L"->{
                            order.createOrder(new Caffe("Capuchino", 4, List.of(Sizes.L)));
                            System.out.println("Кава Capuchino розміру L додана до вашого кошика");
                        }
                    }
                    break;
                }
                case "3" ->{
                    System.out.println("Виберіть розмір: ");
                    Scanner scanner = new Scanner(System.in);
                    String sizeCaffeLatte = scanner.next();
                    switch (sizeCaffeLatte){
                        case "S"->{
                            order.createOrder(new Caffe("Latte", 2, List.of(Sizes.S)));
                            System.out.println("Кава Latte розміру S додана до вашого кошика");
                        }
                        case "L"->{
                            order.createOrder(new Caffe("Latte", 2, List.of(Sizes.L)));
                            System.out.println("Кава Latte розміру L додана до вашого кошика");
                        }
                        case "M"->{
                            order.createOrder(new Caffe("Latte", 2, List.of(Sizes.M)));
                            System.out.println("Кава Latte розміру M додана до вашого кошика");
                        }
                    }
                    break;
                }
                case "4" ->{
                    int i = 0;
                    int sum = order.getTotalPrice();
                    System.out.println("===============Ваш список замовлень==================");
                    for (Caffe c : order.getTotalList()){
                        System.out.println(order.getTotalList().get(i).getName() + " розміром " + order.getTotalList().get(i).getSizes());
                        sum = order.getTotalList().get(1).getPrice() + sum;

                        i ++;
                    }
                    System.out.println("Ціна за все: " + sum);
                    System.out.println("1 - Видалити кофе з замовлення");
                    System.out.println("2 - Купити все");
                    Scanner scanner = new Scanner(System.in);
                    String finalOrder = scanner.next();
                    switch (finalOrder){
                        case "1" ->{
                            System.out.println("Введіть назву кави яку хочете видалити");
                            Scanner scannerOrder = new Scanner(System.in);
                            String deleteOrder = scannerOrder.next();
                            int index = 0;
                            for (Caffe c : order.getTotalList()){
                                if (deleteOrder == c.getName()){
                                    order.getTotalList().remove(index);
                                    index ++;
                                }
                            }

                        }
                    }
                }
            }

        }
    }
}

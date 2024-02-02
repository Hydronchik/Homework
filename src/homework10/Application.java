package homework10;

import java.util.Scanner;

public class Application {
    public static void mainMenu(){
        System.out.println("====Menu====");
        System.out.println("1 - Перевірка місяця");
        System.out.println("2 - Список місяців і пір року");
        System.out.println("3 - Виведе місяці по кількості днів в них");
        System.out.println("4 - Виведе дні в яких найменьше днів");
        System.out.println("5 - Виведе дні в яких найбільше днів");
        System.out.println("6 - Покаже наступну пору року");
        System.out.println("7 - Покаже попередню пору року");
        System.out.println("8 - Виведе місяці з парним числом днів");
        System.out.println("9 - Виведе місяці з непарним числом днів");


    }
    public static void main(String[] args) {

        Seasons[] seasons = Seasons.values();
        Months[] months =  Months.values();
        Scanner mainScan = new Scanner(System.in);

        while (true){
            mainMenu();
            String massageCode = mainScan.next();
            switch (massageCode){
                case "1" -> {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Введіть назву місяця");
                    String nameMonth = scanner.next();
                    if (isMonthExist(months, nameMonth)){
                        System.out.println("Місяць  " + nameMonth.toUpperCase() + " найдений");
                    }else{
                        System.out.println("\u001B[33mМісяць " + nameMonth.toUpperCase() + " не найдено\u001B[0m");
                    }
                }
                case "2" ->{
                    for(int i = 0; i < months.length; i ++){
                        System.out.println (months[i].getSeasons()+ " " + months[i]);

                    }
                }
                case "3" -> {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Введіть кількість днів: ");
                    int numDays = Integer.parseInt(scanner.next());
                    for (int i = 0; i < months.length; i++){
                        if (months[i].getDays() == numDays){
                            System.out.println(months[i]);
                        }else {
                            System.out.println("Місяців з такою кількістю днів нема");
                        }
                    }
                }
                case "6" -> {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Введіть свій місяць: ");
                    String nameMonth = scanner.next();
                    if (isMonthExist(months, nameMonth)){
                        Months monthss = Months.valueOf(nameMonth);
                        int index = monthss.ordinal();
                        if (index == months.length - 1){
                            System.out.println(months[0]);
                        }else {
                            System.out.println(months[index + 1]);
                        }
                    }else {
                        System.out.println("Місяць не був найдений");
                    }
                }
                case "7" -> {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Введіть свій місяць: ");
                    String nameMonth = scanner.next();
                    if (isMonthExist(months, nameMonth)){
                        Months monthss2 = Months.valueOf(nameMonth);
                        int index = monthss2.ordinal();
                        if (index == 0){
                            System.out.println(months[11]);
                        }else {
                            System.out.println(months[index - 1]);
                        }
                    }else {
                        System.out.println("Місяць не був найдений");
                    }
                }
                case "8" -> {
                    for (int i = 0; i < months.length; i++ ){
                        int index = months[i].getDays();
                        if(index % 2 == 0){
                            System.out.println(months[i]);
                        }
                    }
                }
                case "9" -> {
                    for (int i = 0; i < months.length; i++ ){
                        int index = months[i].getDays();
                        if(index % 2 == 1){
                            System.out.println(months[i]);
                        }
                    }
                }
                    }
                }
            }
    private static boolean isMonthExist(Months[] months, String nameMonth) {
        for (Months month : months){
            if (month.name().equalsIgnoreCase(nameMonth)){
                return true;
            }
        }
        return false;
    }
        }
















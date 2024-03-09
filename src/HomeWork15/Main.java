package HomeWork15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void menu(){
        System.out.println("•1 додати депутата (вводимо з консолі)\n" +
                "•2 видалити депутата (вводимо з консолі)\n" +
                "•3 вивести всіх хабарників у фракції\n" +
                "•4 вивести найбільшого хабарника у фракції\n" +
                "•5 вивести всіх депутатів фракції\n" +
                "•6 очистити всю фракцію від депутатів\n" +
                "•7 Дати хабара");

    }
    public static void main(String[] args) {
        Faction faction = new Faction();
        Scanner mainScanner = new Scanner(System.in);
        while (true) {
            menu();
            System.out.println("Введіть номер: ");
            String mainCode = mainScanner.next();
            switch (mainCode) {
                case "1" -> {
                    faction.addDeputy();
                }
                case "2" -> {
                    faction.removeDeputy();
                }
                case "3" -> {
                    faction.getBriber();
                }
                case "4" -> {
                    faction.topBribe();
                }
                case "5" -> {
                    faction.deputyList();
                }
                case "6" -> {
                    faction.clearAllDeputy();
                }
                case "7" -> {
                    faction.giveBride();
                }
            }
        }
    }
}

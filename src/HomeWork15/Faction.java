package HomeWork15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Faction {
    private List<Deputy> deputies = new ArrayList<>();

    public Faction() {
    }

    public List<Deputy> getDeputies() {
        return deputies;
    }

    public void setDeputies(List<Deputy> deputies) {
        this.deputies = deputies;
    }
    public void addDeputy(){
        System.out.println("Введіть вагу депутата: ");
        Scanner scannerWeight = new Scanner(System.in);
        int weight = scannerWeight.nextInt();
        System.out.println("Введіть ріст депутата: ");
        Scanner scannerHeight = new Scanner(System.in);
        int height = scannerHeight.nextInt();
        System.out.println("Введіть прізвище депутата: ");
        Scanner sLastName = new Scanner(System.in);
        String lastName = sLastName.next();
        System.out.println("Введіть ім'я депутата: ");
        Scanner sName = new Scanner(System.in);
        String name = sName.next();
        System.out.println("Введіть вік депутата: ");
        Scanner sAge = new Scanner(System.in);
        int age = sAge.nextInt();
        System.out.println("Цей депутат хабарник?(true, або false)");
        Scanner sBribe = new Scanner(System.in);
        boolean bribe = sBribe.nextBoolean();
        deputies.add(new Deputy(
                weight,
                height,
                lastName,
                name,
                age,
                bribe));
        System.out.println("Ви створили свого депутата!");
        System.out.println(lastName+" "+" "+name + " вага: " + weight +" Ріст: " + height + " Вік: "+ age + " Хабарник: " + bribe);

    }
    public void removeDeputy(){
        System.out.println("Введіть ім'я депутата якого хочете видалити");
        Scanner sRemoveDeputy = new Scanner(System.in);
        String removeDeputy = sRemoveDeputy.next();
        for (Deputy d : deputies){
            if (removeDeputy == d.getName()){
                deputies.remove(d);
                System.out.println("Депутата "+ d.getName() + " " + d.getLastName() + "Було видалено");
            }else{
                System.out.println("Депутата з іменем "+ removeDeputy + "не найдено");

            }
        }

    }
    public void giveBride(){
        System.out.println("Введіть суму хабара");
        Scanner sBribe = new Scanner(System.in);
        int bride = sBribe.nextInt();
        System.out.println("Введіть імя депутата якому хочете дати хабара: ");
        Scanner scanner = new Scanner(System.in);
        String nameDeputy = scanner.next();
        for (Deputy d : deputies){
            if (nameDeputy == d.getName() || bride <= 5000){
                System.out.println("Депутат був найдений, і ви дали хабара");

            } else if (bride > 5000) {
                System.out.println("Депутата піймала міліція");
                deputies.remove(d);
            } else {
                System.out.println("Депутата з таким іменем не найдено");
            }
        }

    }
    public void deputyList(){
        for (Deputy d : deputies){
            System.out.println("Прізвище: " + d.getLastName()
                    +" Ім'я: "+ d.getName()
                    + " Вік: "+ d.getAge()
                    + " Хабарник: " + d.isBribe());
        }
    }
    public void getBriber(){
        for (Deputy d : deputies){
            if (d.isBribe() == true){
                System.out.println(d.getLastName() + " " + d.getName() + "вік: " + d.getAge() + "років" +" cумарно взяв хабарів на "+ d.getSizeBride());
            }
        }
    }
    public void clearAllDeputy(){
        for (Deputy d : deputies){
            deputies.remove(d);
        }
        System.out.println("Всі депутати фракції були видалені!");
    }
    public void topBribe(){
        int maxBribe = 0;
        for (Deputy d : deputies){
            if (maxBribe <= d.getSizeBride()){
                maxBribe = d.getSizeBride();
            }
            for (Deputy c : deputies){
                if (maxBribe == c.getSizeBride()){
                    System.out.println(c.getLastName() + " "+ c.getName() + "є найбільшим хабарником");
                }
            }
        }
    }
}

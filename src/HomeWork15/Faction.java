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
    public void giveBride(int bride){
        System.out.println("Введіть імя депутата якому хочете дати хабара: ");
        Scanner scanner = new Scanner(System.in);
        String nameDeputy = scanner.next();
        for (Deputy d : deputies){
            if (nameDeputy == d.getName() || bride <= 5000){
                System.out.println("Депутат був найдений, і ви дали хабара");
            }else {
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

}

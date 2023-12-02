public class Main {
    public static void main(String[] args) {
        byte a = 1;
        short b = 2;
        int c = 3; // <-- це найбільш поширений тип
        long d = 4;

        // числа з плаваючою точкою (нецілі числа)
        float e = 5.0F;
        double f = 6.0; // <-- це найбільш поширений тип

        // символи
        char g = 'a'; // '%' - це теж символ
        char h = '\u0061'; // 'a' - це теж символ

        // булеві значення - true або false
        boolean flag = true;
        boolean flag2 = false;
        boolean flag3 = 10 > 5;

        // рядки
        String str = "Hello world!";

        // виведення в консоль
//        System.out.println(1);
//        System.out.println(2);
//        System.out.print(1);
//        System.out.print(2);
        System.out.println("Flag3 = " + flag3);
        System.out.println(a);

        System.out.println("==============================");

        // for() - цикл з лічильником
        for (int day = 1; day < 30; day++) {
            System.out.println("Йде сніг " + day + " день");
        }

        System.out.println("Прийшла весна!");

        System.out.println("==============================");

        for(int i = 0; i < 40; i++) {
            System.out.println(i);
        }

        System.out.println("==============================");

        // while() - цикл з передумовою
        boolean isSnow = false;
        while (isSnow){
            System.out.println("Сніг йде!");
        }

        System.out.println("==============================");

        // do-while() - цикл з постумовою
        do {
            System.out.println("Сніг йде!");
        } while (isSnow);

        System.out.println("==============================");

        // if-else - розгалуження
        int age = 20;

        if(age >= 18){
            System.out.println("Можете вживати алкоголь");
        }else{
            System.out.println("Не можете вживати алкоголь");
        }

        System.out.println("==============================");

        if (age > 20){
            System.out.println("Hello");
        } else if (age > 15) {
            System.out.println("Hi");
        } else if (age > 10) {
            System.out.println("Привіт");
        }else{
            System.out.println("Пр");
        }

        System.out.println("==============================");

        switch (age){
            case 10:
                System.out.println("Привіт");
                break;
            case 15:
                System.out.println("Hi");
                break;
            case 20:
                System.out.println("Hello");
                break;
            default:
                System.out.println("Пр");
        }

    }
}
public class homework2 {
    public static void main(String[] args) {
        //#1
        int x1 = 0;
        int x2 = 1;
        for (int sum = 0; sum <= 100; sum++) {

            sum = x1 + x2;

            x1 = x2;
            x2 = sum;

            System.out.println(sum);
        }

        System.out.println("====================================");
        //#2
        int x = 5;
        switch (x){
            case 1:
                System.out.println("це число:"+ x);
                break;
            case 2:
                System.out.println("це число:"+ x);
                break;
            case 3:
                System.out.println("це число:"+ x);
                break;
            case 4:
                System.out.println("це число:"+ x);
                break;
            case 5:
                System.out.println("це число:"+ x);
                break;
        }
        System.out.println("====================================");
        //#3
        int day_in_year = 365;  //- днів у році
        if (day_in_year == 365){
            System.out.println("Рік не високосний бо в ньому " + day_in_year + "днів :C");
        } else if (day_in_year == 366) {
            System.out.println("Рік високосний бо в ньому " + day_in_year + "днів!!!!!!!!!!!!!!!!!!!!!!!!");
        }else {
            System.out.println("Та то вже не рік");
        }
        System.out.println("====================================");
        //#4
        int num1 = 6;
        if (num1 > 0 && num1 % 2 == 0){
            System.out.println("Вааау, твоє чісло " + num1 + " додатнє та ще й парне ОДНОЧАСНО!!!!");
        } else if (num1 < 0 && num1 % 2 == 0) {
            System.out.println("твоє чісло " + num1 + " від'ємне");
        } else if (num1 > 0 && num1 % 2 == 1) {
            System.out.println("твоє чісло " + num1 + " не парне :<");
        }else{
            System.out.println("Твоє чісло не парне і не додатнє, я в шоці");
        }
        System.out.println("====================================");
        //#5
        int num2 = -124;
        if (num2 >= 1000){
            System.out.println("Твоє число більше або = 1000 :O");
        } else if (num2 < 0) {
            System.out.println("Твоє число меньше нуля");
        } else if (num2 > 0 || num2 < 1000) {
            System.out.println("Твоє число меньше 1000");
        }else{
            System.out.println("Я незнаю шо тут нада зробить шоб висвітився цей текст");
        }
        System.out.println("====================================");
        //#6
        for (int a = 1; a < 100; a ++){
            if(a % 2 == 0){
                System.out.println(a);
            }
        }

    }
}
